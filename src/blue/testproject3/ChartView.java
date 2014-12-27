package blue.testproject3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class ChartView extends View {
	
	private Paint min_paint = new Paint();
	
	public ChartView(Context context) {
		super(context);
		// min_paint.setColor(orange);
		// min_paint.setStrokeWidth(line_size);
		// min_paint.setAlpha(180);
	}
	
	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		drawLineChart(canvas);
	}

	private void drawLineChart(Canvas canvas) {
		
		canvas.drawLine(0, 0, 1, 1, min_paint);
		
	}
	

}
