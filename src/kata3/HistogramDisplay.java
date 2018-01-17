package kata3;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay extends ApplicationFrame {
    public HistogramDisplay() {
        super("HISTOGRAMA"); 
        setContentPane(createPanel());
        pack(); 
    }
    
    
    private JPanel createPanel(){
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset())); 
        chartPanel.setPreferredSize(new Dimension(500,400)); 
        return chartPanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset param){
        JFreeChart chart = ChartFactory.createBarChart(
                "JFreeChart Histogram", "Dominio", "Nº de emails", param, 
                PlotOrientation.VERTICAL, false, rootPaneCheckingEnabled,
                rootPaneCheckingEnabled);
        return chart;  
    }
    
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset(); 
        dataSet.addValue(7, "", "google.es");
        dataSet.addValue(14, "", "ulpgc.es");
        dataSet.addValue(9, "", "hotmail.com");
        dataSet.addValue(5, "", "elmundo.es");       
        return dataSet;
    }

    public void execute(){
        setVisible(true); 
    }
}