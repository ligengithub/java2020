package module.source;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author ligen
 * @title: Module
 * @projectName java
 * @description:
 * @date 2020/9/299:58
 */
public class CtwingModule {

    private Long create_time;
    private Long timestamp;

    @JsonProperty("IMEI")
    private String IMEI;

    private InData payload = new InData();


   static class InData {
        @JsonProperty("APPdata")
        private String APPdata;

        public String getAPPdata() {
            return APPdata;
        }

        public void setAPPdata(String APPdata) {
            this.APPdata = APPdata;
        }
    }

    public Long getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Long create_time) {
        this.create_time = create_time;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public InData getPayload() {
        return payload;
    }

    public void setPayload(InData payload) {
        this.payload = payload;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }
}
