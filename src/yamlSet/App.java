package yamlSet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        ObjectMapper mapper = new YAMLMapper();
        try {

            Welcome yamlStructure = mapper.readValue(new FileReader("settings.yaml"), Welcome.class);
           /* Arrays.stream(yamlStructure.getAnimals())
                    .forEach(el-> System.out.println(el.getEmoji()));*/
            Arrays.stream(yamlStructure.getAnimals())
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
