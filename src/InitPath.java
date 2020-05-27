import lejos.robotics.pathfinding.*;

public class InitPath {
    private Node[] nodes;

    public InitPath(){
        initNodes();
        connectNodes();
        getPath();
    }

    private void initNodes(){
        nodes = new Node[11];
        nodes[0] = new Node(0,200);
        nodes[1] = new Node(20,200);
        nodes[2] = new Node(20,0);
        nodes[3] = new Node(40,0);
        nodes[4] = new Node(40,200);
        nodes[5] = new Node(60,200);
        nodes[6] = new Node(60,0);
        nodes[7] = new Node(80,0);
        nodes[8] = new Node(80,200);
        nodes[9] = new Node(100,200);
        nodes[10] = new Node(100,0);
    }

    private void connectNodes(){
        nodes[0].addNeighbor(nodes[1]);
        nodes[1].addNeighbor(nodes[2]);
        nodes[2].addNeighbor(nodes[3]);
        nodes[3].addNeighbor(nodes[4]);
        nodes[4].addNeighbor(nodes[5]);
        nodes[5].addNeighbor(nodes[6]);
        nodes[6].addNeighbor(nodes[7]);
        nodes[7].addNeighbor(nodes[8]);
        nodes[8].addNeighbor(nodes[9]);
        nodes[9].addNeighbor(nodes[10]);
    }

    public Path getPath(){
        AstarSearchAlgorithm aStar = new AstarSearchAlgorithm();
        Path path = aStar.findPath(nodes[0],nodes[10]);
        if(path == null){
            System.out.println("Path does not exist");
        }
        return path;
    }
}