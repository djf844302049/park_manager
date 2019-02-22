package com.monch.park_manager.moduel;

import java.util.List;

/**
 * Created by Administrator on 2018/3/6.
 */

public class StopRecordBean {


    /**
     * total : 1
     * page_num : 1
     * order : [{"order_sn":"201802091234","total_amount":"15.00","pay_time":1519713764,"pay_status":1,"create_time":"2018-02-27 14:41:02","end_time":1519713762,"parking_name":"海沧水云湾车场","fee_id":10}]
     */

    private int total;
    private int page_num;
    private List<OrderBean> order;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPage_num() {
        return page_num;
    }

    public void setPage_num(int page_num) {
        this.page_num = page_num;
    }

    public List<OrderBean> getOrder() {
        return order;
    }

    public void setOrder(List<OrderBean> order) {
        this.order = order;
    }

    public static class OrderBean {
        /**
         * order_sn : 201802091234
         * total_amount : 15.00
         * pay_time : 1519713764
         * pay_status : 1
         * create_time : 2018-02-27 14:41:02
         * end_time : 1519713762
         * parking_name : 海沧水云湾车场
         * unit_id : A00014
         * fee_id : 10
         */

        private String order_sn;
        private String total_amount;
        private long pay_time;
        private int pay_status;
        private long create_time;
        private long end_time;
        private String parking_name;
        private int fee_id;
        private String unit_id;

        public String getUnit_id() {
            return unit_id;
        }

        public void setUnit_id(String unit_id) {
            this.unit_id = unit_id;
        }

        public String getOrder_sn() {
            return order_sn;
        }

        public void setOrder_sn(String order_sn) {
            this.order_sn = order_sn;
        }

        public String getTotal_amount() {
            return total_amount;
        }

        public void setTotal_amount(String total_amount) {
            this.total_amount = total_amount;
        }

        public long getPay_time() {
            return 1000 * pay_time;
        }

        public void setPay_time(int pay_time) {
            this.pay_time = pay_time;
        }

        public int getPay_status() {
            return pay_status;
        }

        public void setPay_status(int pay_status) {
            this.pay_status = pay_status;
        }

        public long getCreate_time() {
            return 1000 * create_time;
        }

        public void setCreate_time(long create_time) {
            this.create_time = create_time;
        }

        public long getEnd_time() {
            return 1000 * end_time;
        }

        public void setEnd_time(long end_time) {
            this.end_time = end_time;
        }

        public String getParking_name() {
            return parking_name;
        }

        public void setParking_name(String parking_name) {
            this.parking_name = parking_name;
        }

        public int getFee_id() {
            return fee_id;
        }

        public void setFee_id(int fee_id) {
            this.fee_id = fee_id;
        }
    }
}
