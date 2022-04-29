package edu.miu.cs.cs544.exercise02_1;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Book extends Product{

    private String title;

    public static Book create(String title) {
        return new Book()
                .builder()
                .title(title)
                .build();
    }

}
