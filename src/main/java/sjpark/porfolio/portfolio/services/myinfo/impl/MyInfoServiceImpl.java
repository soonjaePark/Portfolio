package sjpark.porfolio.portfolio.services.myinfo.impl;

import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import sjpark.porfolio.portfolio.entities.MyInfoEntity;
import sjpark.porfolio.portfolio.entities.repo.MyInfoRepo;
import sjpark.porfolio.portfolio.models.common.ResultMsg;
import sjpark.porfolio.portfolio.models.myinfo.MyInfoModel;
import sjpark.porfolio.portfolio.services.myinfo.MyInfoService;

@Service
@Slf4j
public class MyInfoServiceImpl implements MyInfoService {

    @Autowired
    MyInfoRepo mRepo;
    
    public ResultMsg<List<MyInfoModel>> MyInfoData(){     
        
        List<MyInfoModel> myinfo = mRepo.findAll().stream().map(this::ConvertEntityToModel).collect(Collectors.toList());

        return new ResultMsg<>(true, myinfo);
    }

    public MyInfoModel ConvertEntityToModel(MyInfoEntity mEntity){
        MyInfoModel model = MyInfoModel.builder()
                            .seq(mEntity.getSeq())
                            .name(mEntity.getName())
                            .tel(mEntity.getTel())
                            .age(mEntity.getAge())
                            .email(mEntity.getEmail())
                            .createDt(mEntity.getCreateDt())
                            .modifyDt(mEntity.getModifyDt())
                            .build();

        
        String StrDate = model.getModifyDt().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        model.setModifyDtStr(StrDate);

        return model;
    }

    public ResultMsg<MyInfoModel> MyInfoUpdate(MyInfoModel model){

        Optional<MyInfoEntity> oMyInfoEntity = mRepo.findById(model.getSeq());

        if(!oMyInfoEntity.isPresent()){
            return new ResultMsg<MyInfoModel>(false, "데이터가 존재하지 않습니다");
        }
        
        MyInfoEntity myInfoEntity = oMyInfoEntity.get();

        myInfoEntity.setName(model.getName());
        myInfoEntity.setAge(model.getAge());
        myInfoEntity.setTel(model.getTel());
        myInfoEntity.setEmail(model.getEmail());

        mRepo.save(myInfoEntity);

        MyInfoModel myInfoModel  = ConvertEntityToModel(myInfoEntity);

        return new ResultMsg<MyInfoModel>(true, myInfoModel, "정상적으로 저장되었습니다");
    }
}
