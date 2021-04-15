public class DepthSearch {

	public static void main(String[] args) {
		Graph g = new Graph();
		
		g.addVertex(new Vertex("A"));
		g.addVertex(new Vertex("B"));
		g.addVertex(new Vertex("C"));
		g.addVertex(new Vertex("D"));
		g.addVertex(new Vertex("E"));
		
		g.addEdge(new Edge(g.getVertex("A"), g.getVertex("B"), 2.0));
		g.addEdge(new Edge(g.getVertex("B"), g.getVertex("C"), 3.0));
		g.addEdge(new Edge(g.getVertex("C"), g.getVertex("A"), 6.0));
		g.addEdge(new Edge(g.getVertex("C"), g.getVertex("D"), 4.0));
		g.addEdge(new Edge(g.getVertex("D"), g.getVertex("E"), 5.0));
		
		List<Vertex> allVertices = initDepthSearch(g, "A");
		allVertices.toFirst();
		while(allVertices.hasAccess()) {
			System.out.println(allVertices.getContent().getID());
			allVertices.next();
		}
		
	}
	
	public static List<Vertex> initDepthSearch(Graph g, String startId) {
		g.setAllEdgeMarks(false);
		g.setAllVertexMarks(false);
		Vertex startVertex = g.getVertex(startId);
		return depthSearch(g, startVertex, new List<Vertex>());
	}
	
	private static List<Vertex> depthSearch(Graph g, Vertex curVertex, List<Vertex> pList) {
		pList.append(curVertex);
		curVertex.setMark(true);
		List<Edge> curEdges = g.getEdges(curVertex);
		curEdges.toFirst();
		
		while(curEdges.hasAccess()) {
			Edge curEdge = curEdges.getContent();
			curEdges.next();
			if(curEdge.isMarked()) 
				continue;
			
			Vertex nextVertex;
			if(curEdge.getVertices()[0] == curVertex) 
				nextVertex = curEdge.getVertices()[1];
			else 
				nextVertex = curEdge.getVertices()[0];
			
			if(nextVertex.isMarked()) 
				continue;
			
			curEdge.setMark(true);
			pList.concat(depthSearch(g, nextVertex, new List<Vertex>()));
			
		}
		return pList;
	}

}
