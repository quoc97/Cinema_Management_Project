package com.codegym.dao.entity;

import javax.persistence.*;

@Table(name = "`time_frame`" ,schema = "cinema_module4")
@Entity
public class Time {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "`id_time_frame`")
        private  Integer idTimeFrame;
        private  String screen;
        private  String showDate;
        private  String showDime;
        private String chair;
        private  String price;
        private String total;

        public Time() {
        }



    public Time(Integer idTimeFrame, String screen, String showDate, String showDime, String chair, String price, String total) {
            this.idTimeFrame = idTimeFrame;
            this.screen = screen;
            this.showDate = showDate;
            this.showDime = showDime;
            this.chair = chair;
            this.price = price;
            this.total = total;
        }
    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
        public Integer getIdTimeFrame() {
            return idTimeFrame;
        }

        public void setIdTimeFrame(Integer idTimeFrame) {
            this.idTimeFrame = idTimeFrame;
        }

        public String getScreen() {
            return screen;
        }

        public void setScreen(String screen) {
            this.screen = screen;
        }

        public String getShowDate() {
            return showDate;
        }

        public void setShowDate(String showDate) {
            this.showDate = showDate;
        }

        public String getShowDime() {
            return showDime;
        }

        public void setShowDime(String showDime) {
            this.showDime = showDime;
        }

        public String getChair() {
            return chair;
        }

        public void setChair(String chair) {
            this.chair = chair;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }
    }


