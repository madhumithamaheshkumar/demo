package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
    public class HospitalRepository {
        public List<Hospital> hlist = new ArrayList<Hospital>();

        public List<Hospital> getAll() {
            return hlist;
        }

        public String add(Hospital h) {
            hlist.add(h);
            return "Add Success";
        }

        public String edit(Hospital h) {
            hlist.forEach(e -> {
                if (e.getHid() == h.getHid()) {
                    e = h;
                }
            });
            return "Successfully Updated";
        }

        public String delete(Hospital p) {
            int ind = -1;
            for (int i = 0; i < hlist.size(); i++) {
                Hospital l = hlist.get(i);
                if (l.getHid() == p.getHid()) {
                    ind = i;
                    break;
                }
            }
            if (ind > -1) {
                hlist.remove(ind);
                return "Delete Success";
            } else {
                return "Nothing to Delete ";
            }
        }

    }

