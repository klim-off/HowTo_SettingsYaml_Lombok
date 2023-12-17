package yamlSet;

import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Animal {
    private String name;
    private long age;
    private long weight;
    private String emoji;
}
