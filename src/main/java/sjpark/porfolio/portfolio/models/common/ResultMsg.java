package sjpark.porfolio.portfolio.models.common;

import lombok.Data;

@Data
public class ResultMsg<T> {
    private boolean status;
    private T data;
    private String msg;

    public ResultMsg (Boolean stat, T data){
        this.status = stat;
        this.data = data;
        this.msg = new String();
    }

    public ResultMsg (Boolean stat, String msg ){
        this.status = stat;
        this.msg = msg;
    }

    public ResultMsg (Boolean stat, String msg, T data){
        this.status = stat;
        this.data = data;
        this.msg = msg;
    }

    public ResultMsg(String msg){
        this.status = false;
        this.data = null;
        this.msg = new String(msg);
    }
}
