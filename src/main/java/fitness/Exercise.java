package fitness;

import lombok.Data;

@Data
public class Exercise {
    private String id;
    private String name;
    private AreaAffectedType areaffectedType;


    public Exercise(String id, String name, AreaAffectedType areaffectedType) {
        this.id = id;
        this.name = name;
        this.areaffectedType = areaffectedType;
    }

    public static enum AreaAffectedType{
        UPPER_BODY,
        LOWER_BODY
    }
}
