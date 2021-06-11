package com.example.demo;

    public class Hospital {

        public void setHid(int hid) {
            this.hid = hid;
        }

        public void setPid(int pid) {
            this.pid = pid;
        }

        public void setTid(int tid) {
            this.tid = tid;
        }

        public void setPname(String pname) {
            this.pname = pname;
        }

        public void setTname(String tname) {
            this.tname = tname;
        }
        public Hospital()
        {
            super();
        }
        public Hospital(int hid, int pid, int tid, String pname, String tname) {
            this.hid = hid;
            this.pid = pid;
            this.tid = tid;
            this.pname = pname;
            this.tname = tname;
        }

        public int getHid() {
            return hid;
        }

        public int getPid() {
            return pid;
        }

        public int getTid() {
            return tid;
        }

        public String getPname() {
            return pname;
        }

        public String getTname() {
            return tname;
        }

        int hid,pid,tid;
        String pname,tname;
    }

