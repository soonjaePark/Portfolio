package sjpark.porfolio.portfolio.services.myinfo;

import java.util.List;

import sjpark.porfolio.portfolio.entities.MyInfoEntity;
import sjpark.porfolio.portfolio.models.common.ResultMsg;
import sjpark.porfolio.portfolio.models.myinfo.MyInfoModel;

public interface MyInfoService  {

    public ResultMsg<List<MyInfoModel>> MyInfoData();

}
