package kata.pkg3;

import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay extends ApplicationFrame{
    
    public HistogramDisplay(){
            super("Histograma");
            setContentPane(createPanel());
            pack();
    }
    
    public void execute(){
        setVisible(true);
    }
    
    private JPanel createPanel(){
        ChartPanel chartPanel = new ChartPanel (createChart(createDataset()));
        setPreferredSize(new Dimension(500,400));
        return chartPanel;
    }
    
    private JFreeChart createChart (DefaultCategoryDataset dataset){
        return ChartFactory.createBarChart(
                "histograma JFreeChart",
                "dominios email",
                "Nº de emails",
                dataset, 
                PlotOrientation.VERTICAL, 
                false,
                true,
                true);
    }
    
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(11, "", "gmail.com");
        dataset.addValue(3, "", "outlook.com");
        dataset.addValue(7, "", "ulpgc.com");
        dataset.addValue(4, "", "hotmail.com");
        return dataset;
    }
    
}
