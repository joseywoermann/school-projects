public class Program {

    private Graph graph;

    /**
     * Macht eigentlich gar nix
     */
    public Program() {
        this.graph = new Graph();
    }

    /**
     * don't look at this thanks
     */
    public void setup() {

        Vertex nordamerika = new Vertex("Nordamerika");
        Vertex suedamerika  = new Vertex("Südamerika");
        Vertex europa = new Vertex("Europa");
        Vertex asien = new Vertex("Asien");
        Vertex afrika = new Vertex("Afrika");
        Vertex ozeanien = new Vertex("Ozeanien");
        Vertex antarktis = new Vertex("Antarktis");

        // Knoten hinzufügen
        this.graph.addVertex(nordamerika);
        this.graph.addVertex(suedamerika);
        this.graph.addVertex(europa);
        this.graph.addVertex(asien);
        this.graph.addVertex(afrika);
        this.graph.addVertex(ozeanien);
        this.graph.addVertex(antarktis);

        // Kanten hinzufügen

        this.graph.addEdge(new Edge(nordamerika, suedamerika, 0));
        this.graph.addEdge(new Edge(nordamerika, europa, 4));
        this.graph.addEdge(new Edge(nordamerika, asien, 7));
        this.graph.addEdge(new Edge(nordamerika, afrika, 6));
        this.graph.addEdge(new Edge(nordamerika, ozeanien, 8));
        this.graph.addEdge(new Edge(nordamerika, antarktis, 9));

        this.graph.addEdge(new Edge(suedamerika, europa, 7));
        this.graph.addEdge(new Edge(suedamerika, asien, 8));
        this.graph.addEdge(new Edge(suedamerika, afrika, 4));
        this.graph.addEdge(new Edge(suedamerika, ozeanien, 5));
        this.graph.addEdge(new Edge(suedamerika, antarktis, 3));

        this.graph.addEdge(new Edge(europa, asien, 0));
        this.graph.addEdge(new Edge(europa, afrika, 2));
        this.graph.addEdge(new Edge(europa, ozeanien, 8));
        this.graph.addEdge(new Edge(europa, antarktis, 9));

        this.graph.addEdge(new Edge(asien, afrika, 1));
        this.graph.addEdge(new Edge(asien, ozeanien, 4));
        this.graph.addEdge(new Edge(asien, antarktis, 6));

        this.graph.addEdge(new Edge(afrika, ozeanien, 7));
        this.graph.addEdge(new Edge(afrika, antarktis, 2));

        this.graph.addEdge(new Edge(ozeanien, antarktis, 3));
    }

    /**
     * Print all vertices to the console
     */
    public void printVertices() {
        List<Vertex> vertices = this.graph.getVertices();   

        while (vertices.hasAccess()) {
            System.out.println(vertices.getContent().getID());
            vertices.next();
        }
    }

    public void printEdges() {
        List<Edge> edges = this.graph.getEdges();

        while (edges.hasAccess()) {
            Vertex[] v = edges.getContent().getVertices();

            System.out.println("Distanz zwischen " + v[0].getID() + " und " + v[1].getID() + " ist " + edges.getContent().getWeight() + " Kilometer.");
            edges.next();
        }
    }


}