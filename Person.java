import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Person {

    private String name;

    // ENCAPSULATION
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        // validation
        //TODO: check if name has invalid characters
        // invalid characters: non-alphabet
        // ^ - caret symbol -> NOT operator !true 
        String regex = ".*[^a-zA-Z].*";
        // Meaning: kahit saan mag-start, kahit saan mag-end, lahat ng HINDI a-z and HINDI A-Z, imamatch ko
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        if (matcher.matches()) {
            throw new Error("This name is invalid");
        }

        this.name = name;
    }

}