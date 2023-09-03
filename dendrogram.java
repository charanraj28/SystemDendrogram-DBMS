
import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;
public class dendrogram extends JFrame
{
    private JTree tree;
    public dendrogram()
    {
        //create the cpu node
        DefaultMutableTreeNode cpu = new DefaultMutableTreeNode("CPU");
        //create the child nodes
        DefaultMutableTreeNode chasisNode = new DefaultMutableTreeNode("Chasis");
        
        chasisNode.add(new DefaultMutableTreeNode("Manufacturer"));
        chasisNode.add(new DefaultMutableTreeNode("M-ID"));
        chasisNode.add(new DefaultMutableTreeNode("Length"));
        chasisNode.add(new DefaultMutableTreeNode("Width"));
        chasisNode.add(new DefaultMutableTreeNode("Weight"));
        
        DefaultMutableTreeNode memoryNode = new DefaultMutableTreeNode("Memory");
        
        memoryNode.add(new DefaultMutableTreeNode("RAM"));
        memoryNode.add(new DefaultMutableTreeNode("ROM"));
        memoryNode.add(new DefaultMutableTreeNode("Hard Drive"));
        
        DefaultMutableTreeNode aluNode = new DefaultMutableTreeNode("ALU");
        
       // aluNode.DefaultMutableTreeNode operationNode = new DefaultMutableTreeNode("Operations");
        
        aluNode.add(new DefaultMutableTreeNode("Arithmetic Operations "));
        aluNode.add(new DefaultMutableTreeNode("Logical Operations"));
                
        DefaultMutableTreeNode cuNode = new DefaultMutableTreeNode("CU");
        
        cuNode.add(new DefaultMutableTreeNode("Taking Guidelines"));
        cuNode.add(new DefaultMutableTreeNode("Controlling sequential execution"));
        cuNode.add(new DefaultMutableTreeNode("Manage Information"));
        cuNode.add(new DefaultMutableTreeNode("Directing"));
        cuNode.add(new DefaultMutableTreeNode("Observing"));
        
        //add the child nodes to the cpu node
        cpu.add(chasisNode);
        cpu.add(memoryNode);
        cpu.add(aluNode);
        cpu.add(cuNode);
         
        //create the tree by passing in the cpu node
        tree = new JTree(cpu);
        add(tree);
        add(new JScrollPane(tree));
         
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("System Dendrogram");  
        //this.setSize(400,800);
        this.pack();
        this.setVisible(true);
       


    }
     
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable() {
           @Override
            public void run() {
                new dendrogram();
            }
        });
    }       
}