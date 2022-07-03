package sjpark.porfolio.portfolio.controllers.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import sjpark.porfolio.portfolio.models.common.ResultMsg;
import sjpark.porfolio.portfolio.models.myinfo.MyInfoModel;
import sjpark.porfolio.portfolio.services.myinfo.MyInfoService;

@Controller
@RequestMapping("/mng/myinfo")
public class MyInfoMngController {
    
    @Autowired
    MyInfoService mService;

    @GetMapping()
    public String getMyInfoMng() {
        return "/manager/myinfo_mng/myinfo_mng";
    }

    @GetMapping("/data")
    public @ResponseBody ResultMsg<List<MyInfoModel>> getData(){
        return  mService.MyInfoData();
    }

    @PostMapping("/update")
    public @ResponseBody ResultMsg<MyInfoModel> getData(MyInfoModel model){
        return mService.MyInfoUpdate(model);
    }
}
