package xyz;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionAssignment {
    private String[] names;
    private List<String> colorList;
    private Set<String>  hobbySet;
    private Map<String,String>  ageMap;
    private Properties properties;

    public List<String> getColorList() {
        return colorList;
    }

    public void setColorList(List<String> colorList) {
        this.colorList = colorList;
    }

    public Set<String> getHobbySet() {
        return hobbySet;
    }

    public void setHobbySet(Set<String> hobbySet) {
        this.hobbySet = hobbySet;
    }

    public Map<String, String> getAgeMap() {
        return ageMap;
    }

    public void setAgeMap(Map<String, String> ageMap) {
        this.ageMap = ageMap;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public String[] getNames() {

        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    @Override
    public String toString() {
        String nameStr = "";
        for (String name : names) {
            nameStr+=name+",";
        }
        return "Name:"+nameStr+"\nColor:"+colorList+"\nHobby:"+hobbySet+"\nAge:"+ageMap+"\nProp:"+properties;
    }
}
