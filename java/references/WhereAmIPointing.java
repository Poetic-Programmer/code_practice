/**
 * @author michael dunleavy
 * @since 22/07/2016
 *
 * show the effects of creating incorrect buffer functions.
 */

public class WhereAmIPointing{
	public static void main(String [] args){
		WhereAmIPointing program = new WhereAmIPointing();
		program.run();
	}

	private static class Vector2{
		private static float [] buffer = new float[2]; // dangerous use of memory!
		public static float [] getSub(float [] a, float [] b){
			buffer[0] = a[0] - b[0];
			buffer[1] = a[1] - b[1];
			return buffer;
		}	

		public static void set(float [] dst, final float [] src){
			dst[0] = src[0];
			dst[1] = src[1];
		}

		public static void print(float [] vec2){
			System.out.println("<" + vec2[0] + ", " + vec2[1] + ">");
		}
	}

	public void run(){
	    // create 3 vectors
		float [] vecA = new float[2];
		float [] vecB = new float[2];
		float [] vecC = new float[2];

		// this will point to the buffer in the vector class
		vecA = Vector2.getSub(new float [] {10, 10}, new float[]{2, 8});
		
		// This does not use the private buffer so the values should be safe
		Vector2.set(vecB, new float [] {3, 3});
		
		// this will change the contents of the buffer, changing both A and C.
		vecC = Vector2.getSub(vecA, vecB);

		// show the results
		Vector2.print(vecA);
		Vector2.print(vecB);
		Vector2.print(vecC);
	}	
}
