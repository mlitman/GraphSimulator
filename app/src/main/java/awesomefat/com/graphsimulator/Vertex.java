package awesomefat.com.graphsimulator;

import java.util.LinkedList;

/**
 * Created by michaellitman on 5/4/17.
 */

public class Vertex
{
    private LinkedList<Edge> theEdges;
    private String name;

    public Vertex(String name)
    {
        this.theEdges = new LinkedList<Edge>();
        this.name = name;
    }
}
