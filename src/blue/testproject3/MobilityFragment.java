package blue.testproject3;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import blue.testproject3.ChartView;


public class MobilityFragment extends Fragment {
	
	private View view;
	private ChartView lineChart;
	
	@Override
	public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		
		FrameLayout layout=(FrameLayout) view.findViewById(R.id.canvas_frame);  
        final ChartView lineChart = new ChartView(this);
        lineChart.setMinimumHeight(500);
        lineChart.setMinimumWidth(300);
        //通知view组件重绘    
        lineChart.invalidate();
        layout.addView(lineChart);
		
//		// FrameLayout canvasFrameLayout = (FrameLayout) view.findViewById(R.id.canvas_frame);
//        // final ChartView lineChart = new ChartView();
//		lineChart = (ChartView) view.findViewById(R.id.chartView);
////		if(lineChart == null)
////			return view;
//		
//        //通知view组件重绘    
//        lineChart.invalidate();
//        // canvasFrameLayout.addView(lineChart); 
        
		return inflater.inflate(R.layout.fragment_mobility, container, false);
	}
}
