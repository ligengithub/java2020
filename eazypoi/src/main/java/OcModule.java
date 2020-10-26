import java.util.List;

/**
 * @author ligen
 * @title: Module
 * @projectName java
 * @description:
 * @date 2020/9/299:58
 */
public class OcModule {

    private Long create_time;

    private String device_id;


    List<InData> services;


    static class Data {
        private InData data = new InData();

        public InData getData() {
            return data;
        }

        public void setData(InData data) {
            this.data = data;
        }
    }


    static class InData {
        private String serviceType;
        private String data;
        private String eventTime;
        private String serviceId;

        public String getServiceType() {
            return serviceType;
        }

        public void setServiceType(String serviceType) {
            this.serviceType = serviceType;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public String getEventTime() {
            return eventTime;
        }

        public void setEventTime(String eventTime) {
            this.eventTime = eventTime;
        }

        public String getServiceId() {
            return serviceId;
        }

        public void setServiceId(String serviceId) {
            this.serviceId = serviceId;
        }
    }

    public Long getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Long create_time) {
        this.create_time = create_time;
    }

    public String getDevice_id() {
        return device_id;
    }

    public void setDevice_id(String device_id) {
        this.device_id = device_id;
    }

    public List<InData> getServices() {
        return services;
    }

    public void setServices(List<InData> services) {
        this.services = services;
    }


}
