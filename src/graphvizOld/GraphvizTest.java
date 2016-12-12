package graphvizOld;

import java.io.File;

public class GraphvizTest {
    public static void main(String[] args) {
    	GraphvizTest p = new GraphvizTest();
        p.start();
            // p.start2();
    }


    private void start() {
            GraphvizOld gv = new GraphvizOld();
            gv.addln(gv.start_graph());
            gv.addln("rankdir = LR");
            gv.addln("encoding=\"UTF-8\"");
            gv.addln("node [shape=box,fontname=\"simhei.ttf\",style=filled, fillcolor=\".7 .3 1.0\", color=green, fontsize=10]");
            gv.addln("edge[arrowsize= 1.5, arrowhead=\"open\",fontsize=10]");
            gv.addln("A -> D->黑体[penwidth=7,color=\"red\"];");
            gv.addln("A -> C;");
            gv.addln("计算机->C->B;");
            gv.addln(gv.end_graph());
//            System.out.println(gv.getDotSource());


            String type = "png";
            // String type = "dot";
            // String type = "fig"; // open with xfig
            // String type = "pdf";
            // String type = "ps";
            // String type = "svg"; // open with inkscape
            // String type = "png";
            // String type = "plain";
            File out = new File("/Users/hxy/Documents/毕设相关/graphviz绘图/out." + type);
            System.out.println(gv.getDotSource());
            gv.writeGraphToFile(gv.getGraph(gv.getDotSource(), type), out);
            System.out.println("test2");
            

    }
}

