package com.example.demo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TreatmentRepository {

    public List<Treatment> tlist=new ArrayList<Treatment>();
    public List<Treatment> getAll()
    {
        return tlist;
    }
    public String add(Treatment t)
    {
        tlist.add(t);
        return "Treatment Add Success";
    }
    public String edit(Treatment t)
    {
        tlist.forEach(e->{
            if(e.getId()==t.getId())
            {
                e.setName(t.getName());
            }
        });
        return "Treatment Successfully Updated";
    }
    public String delete(Treatment t)
    {
        int ind=-1;
        for(int i=0;i<tlist.size();i++)
        {
            Treatment l=tlist.get(i);
            if(l.getId()==t.getId())
            {
                ind=i;
                break;
            }
        }
        if(ind>-1)
        {
            tlist.remove(ind);
            return "Treatment Delete Success";
        }
        else
        {
            return "Nothing to Delete ";
        }

    }

}


