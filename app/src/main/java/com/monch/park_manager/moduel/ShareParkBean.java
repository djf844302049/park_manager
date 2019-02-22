package com.monch.park_manager.moduel;

import java.util.List;

public class ShareParkBean {

    /**
     * count_data : {"total":2,"free":2,"busy":0,"use":0}
     * park : {"parking_id":10,"parking_name":"共享停车场一","type":2,"city_id":0,"lat":"24.479948","lng":"118.041212","num":0,"bad_num":0,"thumb":"http://park.deyuelou.top/images/b4d26014d306c0a060e6180cef3dd5dd.jpg","province":16068,"city":16278,"district":16294,"town":0,"address":"测试测试","fee_id":1,"create_time":1528187867,"update_time":1529630087,"category":3,"status":1,"business_time":"00:00:00","non_business_time":"23:59:00","appointment_money":6,"area_1":"福建省","area_2":"厦门市","area_3":"海沧区","area_4":"测试测试"}
     * use_arr : []
     * free_arr : [{"unit_id":"Z0001S","user_id":18,"lockid":"0","sub_type":4,"sub_id":0,"fee_id":2,"share_time":"14:00-18:00","status":1,"open_status":1,"positionDesc":0,"parking_id":10,"hourfee":"3.00","overdose":"5.00","bank_card":999999999,"order_sn":null,"frozen_time":0,"lat":"24.479657","lng":"118.042584","status_key":"free"},{"unit_id":"Z0002S","user_id":12,"lockid":"0","sub_type":4,"sub_id":0,"fee_id":2,"share_time":"14:00-18:00","status":1,"open_status":1,"positionDesc":1,"parking_id":10,"hourfee":"0.00","overdose":"0.00","bank_card":1321321,"order_sn":null,"frozen_time":0,"lat":"","lng":"","status_key":"free"}]
     * busy_arr : []
     */

    private CountDataBean count_data;
    private ParkBean park;
    private List<FreeArrBean> use_arr;
    private List<FreeArrBean> free_arr;
    private List<FreeArrBean> busy_arr;

    public CountDataBean getCount_data() {
        return count_data;
    }

    public void setCount_data(CountDataBean count_data) {
        this.count_data = count_data;
    }

    public ParkBean getPark() {
        return park;
    }

    public void setPark(ParkBean park) {
        this.park = park;
    }

    public List<FreeArrBean> getUse_arr() {
        return use_arr;
    }

    public void setUse_arr(List<FreeArrBean> use_arr) {
        this.use_arr = use_arr;
    }

    public List<FreeArrBean> getFree_arr() {
        return free_arr;
    }

    public void setFree_arr(List<FreeArrBean> free_arr) {
        this.free_arr = free_arr;
    }

    public List<FreeArrBean> getBusy_arr() {
        return busy_arr;
    }

    public void setBusy_arr(List<FreeArrBean> busy_arr) {
        this.busy_arr = busy_arr;
    }

    public static class CountDataBean {
        /**
         * total : 2
         * free : 2
         * busy : 0
         * use : 0
         */

        private int total;
        private int free;
        private int busy;
        private int use;

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public int getFree() {
            return free;
        }

        public void setFree(int free) {
            this.free = free;
        }

        public int getBusy() {
            return busy;
        }

        public void setBusy(int busy) {
            this.busy = busy;
        }

        public int getUse() {
            return use;
        }

        public void setUse(int use) {
            this.use = use;
        }
    }

    public static class ParkBean {
        /**
         * parking_id : 10
         * parking_name : 共享停车场一
         * type : 2
         * city_id : 0
         * lat : 24.479948
         * lng : 118.041212
         * num : 0
         * bad_num : 0
         * thumb : http://park.deyuelou.top/images/b4d26014d306c0a060e6180cef3dd5dd.jpg
         * province : 16068
         * city : 16278
         * district : 16294
         * town : 0
         * address : 测试测试
         * fee_id : 1
         * create_time : 1528187867
         * update_time : 1529630087
         * category : 3
         * status : 1
         * business_time : 00:00:00
         * non_business_time : 23:59:00
         * appointment_money : 6
         * area_1 : 福建省
         * area_2 : 厦门市
         * area_3 : 海沧区
         * area_4 : 测试测试
         */

        private int parking_id;
        private String parking_name;
        private int type;
        private int city_id;
        private String lat;
        private String lng;
        private int num;
        private int bad_num;
        private String thumb;
        private int province;
        private int city;
        private int district;
        private int town;
        private String address;
        private int fee_id;
        private int create_time;
        private int update_time;
        private int category;
        private int status;
        private String business_time;
        private String non_business_time;
        private int appointment_money;
        private String area_1;
        private String area_2;
        private String area_3;
        private String area_4;

        public int getParking_id() {
            return parking_id;
        }

        public void setParking_id(int parking_id) {
            this.parking_id = parking_id;
        }

        public String getParking_name() {
            return parking_name;
        }

        public void setParking_name(String parking_name) {
            this.parking_name = parking_name;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getCity_id() {
            return city_id;
        }

        public void setCity_id(int city_id) {
            this.city_id = city_id;
        }

        public String getLat() {
            return lat;
        }

        public void setLat(String lat) {
            this.lat = lat;
        }

        public String getLng() {
            return lng;
        }

        public void setLng(String lng) {
            this.lng = lng;
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public int getBad_num() {
            return bad_num;
        }

        public void setBad_num(int bad_num) {
            this.bad_num = bad_num;
        }

        public String getThumb() {
            return thumb;
        }

        public void setThumb(String thumb) {
            this.thumb = thumb;
        }

        public int getProvince() {
            return province;
        }

        public void setProvince(int province) {
            this.province = province;
        }

        public int getCity() {
            return city;
        }

        public void setCity(int city) {
            this.city = city;
        }

        public int getDistrict() {
            return district;
        }

        public void setDistrict(int district) {
            this.district = district;
        }

        public int getTown() {
            return town;
        }

        public void setTown(int town) {
            this.town = town;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public int getFee_id() {
            return fee_id;
        }

        public void setFee_id(int fee_id) {
            this.fee_id = fee_id;
        }

        public int getCreate_time() {
            return create_time;
        }

        public void setCreate_time(int create_time) {
            this.create_time = create_time;
        }

        public int getUpdate_time() {
            return update_time;
        }

        public void setUpdate_time(int update_time) {
            this.update_time = update_time;
        }

        public int getCategory() {
            return category;
        }

        public void setCategory(int category) {
            this.category = category;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getBusiness_time() {
            return business_time;
        }

        public void setBusiness_time(String business_time) {
            this.business_time = business_time;
        }

        public String getNon_business_time() {
            return non_business_time;
        }

        public void setNon_business_time(String non_business_time) {
            this.non_business_time = non_business_time;
        }

        public int getAppointment_money() {
            return appointment_money;
        }

        public void setAppointment_money(int appointment_money) {
            this.appointment_money = appointment_money;
        }

        public String getArea_1() {
            return area_1;
        }

        public void setArea_1(String area_1) {
            this.area_1 = area_1;
        }

        public String getArea_2() {
            return area_2;
        }

        public void setArea_2(String area_2) {
            this.area_2 = area_2;
        }

        public String getArea_3() {
            return area_3;
        }

        public void setArea_3(String area_3) {
            this.area_3 = area_3;
        }

        public String getArea_4() {
            return area_4;
        }

        public void setArea_4(String area_4) {
            this.area_4 = area_4;
        }
    }

    public static class FreeArrBean {
        /**
         * unit_id : Z0001S
         * user_id : 18
         * lockid : 0
         * sub_type : 4
         * sub_id : 0
         * fee_id : 2
         * share_time : 14:00-18:00
         * status : 1
         * open_status : 1
         * positionDesc : 0
         * parking_id : 10
         * hourfee : 3.00
         * overdose : 5.00
         * bank_card : 999999999
         * order_sn : null
         * frozen_time : 0
         * lat : 24.479657
         * lng : 118.042584
         * appointment_money : 3.00
         * status_key : free
         */

        private String unit_id;
        private int user_id;
        private String lockid;
        private int sub_type;
        private int sub_id;
        private int fee_id;
        private String share_time;
        private int status;
        private int open_status;
        private int positionDesc;
        private int parking_id;
        private String hourfee;
        private String overdose;
        private int bank_card;
        private Object order_sn;
        private int frozen_time;
        private String lat;
        private String lng;
        private String status_key;
        private float appointment_money;

        public float getAppointment_money() {
            return appointment_money;
        }

        public void setAppointment_money(float appointment_money) {
            this.appointment_money = appointment_money;
        }

        public String getUnit_id() {
            return unit_id;
        }

        public void setUnit_id(String unit_id) {
            this.unit_id = unit_id;
        }

        public int getUser_id() {
            return user_id;
        }

        public void setUser_id(int user_id) {
            this.user_id = user_id;
        }

        public String getLockid() {
            return lockid;
        }

        public void setLockid(String lockid) {
            this.lockid = lockid;
        }

        public int getSub_type() {
            return sub_type;
        }

        public void setSub_type(int sub_type) {
            this.sub_type = sub_type;
        }

        public int getSub_id() {
            return sub_id;
        }

        public void setSub_id(int sub_id) {
            this.sub_id = sub_id;
        }

        public int getFee_id() {
            return fee_id;
        }

        public void setFee_id(int fee_id) {
            this.fee_id = fee_id;
        }

        public String getShare_time() {
            return share_time;
        }

        public void setShare_time(String share_time) {
            this.share_time = share_time;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getOpen_status() {
            return open_status;
        }

        public void setOpen_status(int open_status) {
            this.open_status = open_status;
        }

        public int getPositionDesc() {
            return positionDesc;
        }

        public void setPositionDesc(int positionDesc) {
            this.positionDesc = positionDesc;
        }

        public int getParking_id() {
            return parking_id;
        }

        public void setParking_id(int parking_id) {
            this.parking_id = parking_id;
        }

        public String getHourfee() {
            return hourfee;
        }

        public void setHourfee(String hourfee) {
            this.hourfee = hourfee;
        }

        public String getOverdose() {
            return overdose;
        }

        public void setOverdose(String overdose) {
            this.overdose = overdose;
        }

        public int getBank_card() {
            return bank_card;
        }

        public void setBank_card(int bank_card) {
            this.bank_card = bank_card;
        }

        public Object getOrder_sn() {
            return order_sn;
        }

        public void setOrder_sn(Object order_sn) {
            this.order_sn = order_sn;
        }

        public int getFrozen_time() {
            return frozen_time;
        }

        public void setFrozen_time(int frozen_time) {
            this.frozen_time = frozen_time;
        }

        public String getLat() {
            return lat;
        }

        public void setLat(String lat) {
            this.lat = lat;
        }

        public String getLng() {
            return lng;
        }

        public void setLng(String lng) {
            this.lng = lng;
        }

        public String getStatus_key() {
            return status_key;
        }

        public void setStatus_key(String status_key) {
            this.status_key = status_key;
        }
    }
}
