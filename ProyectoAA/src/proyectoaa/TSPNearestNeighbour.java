/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoaa;

/**
 *
 * @author felix
 */
import java.util.ArrayList;
import java.util.Stack;

public class TSPNearestNeighbour {

    private int numberOfNodes;
    private Stack<Integer> stack;

    public TSPNearestNeighbour() {
        stack = new Stack<Integer>();
    }

    public ArrayList<Integer> tsp(int adjacencyMatrix[][]) {
        ArrayList<Integer> resp = new ArrayList();
        numberOfNodes = adjacencyMatrix[1].length - 1;
        int[] visited = new int[numberOfNodes + 1];
        visited[1] = 1;
        resp.add(1);
        stack.push(1);
        int element, dst = 0, i;
        int min = Integer.MAX_VALUE;
        boolean minFlag = false;
        System.out.print(1 + "\t");
 
        while (!stack.isEmpty())
        {
            element = stack.peek();
            i = 1;
            min = Integer.MAX_VALUE;
            while (i <= numberOfNodes)
            {
                if (adjacencyMatrix[element][i] >= 1 && visited[i] == 0)
                {
                    if (min > adjacencyMatrix[element][i])
                    {
                        min = adjacencyMatrix[element][i];
                        dst = i;
                        minFlag = true;
                    }
                }
                i++;
            }
            if (minFlag)
            {
                visited[dst] = 1;
                stack.push(dst);
                System.out.print(dst + "\t");
                resp.add(dst);
                minFlag = false;
                continue;
            }
            stack.pop();
        }
        System.out.println("\n");
        return resp;
    }
}
