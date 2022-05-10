package sjpark.porfolio.portfolio.models.common;

import lombok.Data;

@Data
public class ResultMsg<T> {
    private boolean status;
    private T data;
    private String log;

    public ResultMsg (Boolean stat, T data){
        this.status = stat;
        this.data = data;
        this.log = new String();
    }

    public ResultMsg (Boolean stat, String msg ){
        this.status = stat;
        this.log = msg;
    }

    public ResultMsg (Boolean stat, T data, String msg){
        this.status = stat;
        this.data = data;
        this.log = msg;
    }

    public ResultMsg(String msg){
        this.status = false;
        this.data = null;
        this.log = new String(log);
    }
}
