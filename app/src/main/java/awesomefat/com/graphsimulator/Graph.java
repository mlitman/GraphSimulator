package awesomefat.com.graphsimulator;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by michaellitman on 5/4/17.
 */

public class Graph
{
    private Vertex root;
    private LinkedList<Vertex> vertices;
    private ArrayList<String> vertexNames;

    public Graph()
    {
        this.root = null;
        this.vertices = new LinkedList<Vertex>();
        this.vertexNames = new ArrayList<String>();
    }

    public void addVertex(String name)
    {
        Vertex theNewVertex = new Vertex(name);
        if(this.root == null)
        {
            this.root = theNewVertex;
        }
        this.vertices.add(theNewVertex);
        this.vertexNames.add(name);
    }

    public ArrayList<String> getVertexNames()
    {
        return this.vertexNames;
    }
}
