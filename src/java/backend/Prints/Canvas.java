package backend.Prints;

import backend.Authors.Author;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
public class Canvas extends Print {

    //8x8, 30x30 (popular)
    private double canvasSize;
//    private enum canvasType;
    //glossy canvass, matte type

    @Id
    @GeneratedValue
    private Long id;


    @ManyToOne
    private Author author;


}
