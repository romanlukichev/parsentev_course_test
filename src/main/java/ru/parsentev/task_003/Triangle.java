package ru.parsentev.task_003;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.parsentev.task_002.Point;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class Triangle {
    private static final Logger log = getLogger(Triangle.class);

    protected final Point first;
    protected final Point second;
    protected final Point third;

    public Triangle(final Point first, final Point second, final Point third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public boolean exists() {
        // the equation of a line: ( y1 - y2 )*x + ( x2 - x1 )*y + ( x1*y2 - x2*y1) = 0
        double a =  this.first.getY() - this.second.getY() ;  // a=y1-y2;
        double b = this.second.getX() - this.first.getX() ;   // b=x2-x1;
        double c = ( this.first.getX() * this.second.getY() - this.second.getX() * this.first.getY() );  //c=x1*y2-x2y1;
        // if in an equasion  a*x+b*y+c=0 the given pair of x and y variables fits this equation
        // then all three points are belong  to the same right line and thus the triangle is impossible.
        double x = this.third.getX();
        double y = this.third.getY();
        if((a*x+b*y+c) == 0d ){
            return false;
        }
        return true;

    }

    public double area() {
        if( this.exists()) {
            double m1 = (this.first.getX() - this.third.getX()) * (this.second.getY() - this.third.getY());
            double m2 = (this.second.getX() - this.third.getX()) * (this.first.getY() - this.third.getY());
            return 0.5d * (m1 - m2);
        } else {
            throw new java.lang.IllegalStateException("Triangle does not exists");
        }
    }
}
