package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class PatientService {

    @Autowired
    PatientRepository prepository;

    @Autowired
    TreatmentRepository trepository;

    @Autowired
    HospitalRepository hrepository;

    Hospital h=new Hospital();

    Patient searchPatient(int pid)
    {

        List<Patient> tmp_plist=prepository.getAll();

        for(int i=0;i<tmp_plist.size();i++)
        {
            Patient p=tmp_plist.get(i);
            if(p.getId()==pid)
            {
                return p;
            }
        }
        return null;
    }

    Treatment searchTreatment(int tid)
    {

        List<Treatment> tmp_tlist=trepository.getAll();

        for(int i=0;i<tmp_tlist.size();i++)
        {
            Treatment t=tmp_tlist.get(i);
            if(t.getId()==tid)
            {
                return t;
            }
        }
        return null;
    }

    public List<Patient> getAll()
    {
        return prepository.getAll();
    }

    public String add(Patient p)
    {
        return prepository.add(p);
    }

    public String edit(Patient p)
    {
        return prepository.edit(p);
    }
    public String delete(Patient p)
    {
        return prepository.delete(p);
    }

    public String addHospital(Hospital h)
    {
        int pid=h.getPid();
        int tid=h.getTid();

        Patient p=searchPatient(pid);
        Treatment t=searchTreatment(tid);

        if(p==null)
        {
            return "Error:No Patient ID Found";
        }
        if(t==null)
        {
            return "Error:No Treatment ID Found";
        }

        h.setPname(p.getName());
        h.setTname(t.getName());

        return hrepository.add(h);

    }

}


