package rs.ftn.ingzanja.dto;

import java.util.List;
public class CaseBasedInfo {



    private Long iDPregleda;
    private List<String> simptomi;


    public int getiDPregleda() {
        return iDPregleda;
    }

    public List<String> getSimptomi() {
        return simptomi;
    }

    public CaseBasedInfo(){}
}
