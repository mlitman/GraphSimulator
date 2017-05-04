package awesomefat.com.graphsimulator;

/**
 * Created by michaellitman on 5/4/17.
 */

public class Edge
{
    private Vertex destination;
    private int weight;

    public Edge(Vertex destination, int weight)
    {
        this.destination = destination;
        this.weight = weight;
    }
}
