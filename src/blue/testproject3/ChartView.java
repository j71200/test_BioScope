package blue.testproject3;

import java.util.ArrayList;
import java.util.Random;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

public class ChartView extends View {
	
	private Paint min_paint = new Paint();
	private ArrayList<Integer> cord_x = new ArrayList<Integer>();
	private ArrayList<Integer> cord_y = new ArrayList<Integer>();
		
	public ChartView(Context context, AttributeSet attrs) {
		super(context, attrs);
		min_paint.setColor(Color.RED);
		min_paint.setStrokeWidth(4);
        
	}
	
	
	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		drawLineChart(canvas);
	}

	public void drawLineChart(Canvas canvas) {
		if ( cord_x.size() == 0){
	        cord_x.add(100);
	        cord_y.add(400);
			return;
		}
		
		Random rand = new Random();
		cord_x.add( cord_x.get(cord_x.size()-1) + 50 );
        cord_y.add( 400 + rand.nextInt(200) - 100 );
        
		for(int idx = 0; idx < cord_x.size()-2; idx++){
			canvas.drawLine(cord_x.get(idx), cord_y.get(idx), cord_x.get(idx+1), cord_y.get(idx+1), min_paint);
		}
		
		Log.d("ChartView", "At_drawLineChart: " + cord_x.size());
	}
}

