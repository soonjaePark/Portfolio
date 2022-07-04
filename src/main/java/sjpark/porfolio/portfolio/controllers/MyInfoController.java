package sjpark.porfolio.portfolio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//sourvetree test
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;
import sjpark.porfolio.portfolio.entities.MyInfoEntity;
import sjpark.porfolio.portfolio.models.common.ResultMsg;
import sjpark.porfolio.portfolio.models.myinfo.MyInfoModel;
import sjpark.porfolio.portfolio.services.myinfo.MyInfoService;

@Controller
@Slf4j
@RequestMapping("/myinfo")
public class MyInfoController {
    @Autowired
    MyInfoService mService;


    @GetMapping
    public String myInfo() {
        
        return "myinfo/myInfo";
    }

    @GetMapping("/data")
    public @ResponseBody ResultMsg<List<MyInfoModel>> getData(){        
        return mService.MyInfoData();
    }

    @GetMapping("/detail")
    public @ResponseBody ResultMsg<MyInfoModel> detailData (){
        return null;
    }

    @PostMapping("/save")
    public @ResponseBody ResultMsg<MyInfoModel> saveData (MyInfoModel model){
        log.info(model.toString());
        return null;
    }

    
}