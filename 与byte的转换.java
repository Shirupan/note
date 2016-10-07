package com.smarlova.common;

public class FormatTransfer {
		  
		public   static   byte [] toLH( int  n) { 
		   byte [] b =  new   byte [ 4 ]; 
		   b[0 ] = ( byte ) (n &  0xff ); 
		   b[1 ] = ( byte ) (n >>  8  &  0xff ); 
		   b[2 ] = ( byte ) (n >>  16  &  0xff ); 
		   b[3 ] = ( byte ) (n >>  24  &  0xff ); 
		   return  b; 
		}  
		  
		  
		  
		public   static   byte [] toHH( int  n) { 
		   byte [] b =  new   byte [ 4 ]; 
		   b[3 ] = ( byte ) (n &  0xff ); 
		   b[2 ] = ( byte ) (n >>   8  &  0xff ); 
		   b[1 ] = ( byte ) (n >>   16  &  0xff ); 
		   b[0 ] = ( byte ) (n >>   24  &  0xff ); 
		   return  b; 
		}  
		  
		  
		public   static   byte [] toLH( short  n) { 
		   byte [] b =  new   byte [ 2 ]; 
		   b[0 ] = ( byte ) (n &  0xff ); 
		   b[1 ] = ( byte ) (n >>  8  &  0xff ); 
		   return  b; 
		}

		  
		  
		public   static   byte [] toHH( short  n) { 
		   byte [] b =  new   byte [ 2 ]; 
		   b[1 ] = ( byte ) (n &  0xff ); 
		   b[0 ] = ( byte ) (n >>  8  &  0xff ); 
		   return  b; 
		}  
		  
		
		public   static   byte [] toLH( long  n) { 
			   byte [] b =  new   byte [ 8 ]; 
			   b[0 ] = ( byte ) (n &  0xff ); 
			   b[1 ] = ( byte ) (n >>  8  &  0xff ); 
			   b[2 ] = ( byte ) (n >>  16  &  0xff ); 
			   b[3 ] = ( byte ) (n >>  24  &  0xff ); 
			   b[4 ] = ( byte ) (n >>  32 &  0xff ); 
			   b[5 ] = ( byte ) (n >>  40  &  0xff ); 
			   b[6 ] = ( byte ) (n >>  48  &  0xff ); 
			   b[7 ] = ( byte ) (n >>  56  &  0xff ); 

			   return  b; 
			}
		
		public   static   byte [] toHH( long  n) { 
			   byte [] b =  new   byte [ 8 ]; 
			   b[7 ] = ( byte ) (n &  0xff ); 
			   b[6 ] = ( byte ) (n >>  8  &  0xff ); 
			   b[5 ] = ( byte ) (n >>  16  &  0xff ); 
			   b[4 ] = ( byte ) (n >>  24  &  0xff ); 
			   b[3 ] = ( byte ) (n >>  32 &  0xff ); 
			   b[2 ] = ( byte ) (n >>  40  &  0xff ); 
			   b[1 ] = ( byte ) (n >>  48  &  0xff ); 
			   b[0 ] = ( byte ) (n >>  56  &  0xff ); 

			   return  b; 
			}   
		  
		   
		  
		  
		public   static   byte [] toLH( float  f) { 
		   return  toLH(Float.floatToRawIntBits(f)); 
		}  
		  
		public   static   byte [] toHH( float  f) { 
		   return  toHH(Float.floatToRawIntBits(f)); 
		}

		  
		  
		public   static   byte [] stringToBytes(String s,  int  length) { 
		   while  (s.getBytes().length < length) { 
		     s += " " ; 
		   } 
		   return  s.getBytes(); 
		}  
		  
		  
		  
		public   static  String bytesToString( byte [] b) { 
		   StringBuffer result = new  StringBuffer( "" ); 
		   int  length = b.length; 
		   for  ( int  i= 0 ; i< length; i++) { 
		     result.append((char )(b[i] &  0xff )); 
		   } 
		   return  result.toString(); 
		}

		  
		  
		public   static   byte [] stringToBytes(String s) { 
		   return  s.getBytes(); 
		}

		  
		  
		public   static   int  hBytesToInt( byte [] b) { 
		   int  s =  0 ; 
		   for  ( int  i =  0 ; i <  3 ; i++) { 
		     if  (b[i] >=  0 ) { 
		     s = s + b[i]; 
		     } else  { 
		     s = s + 256  + b[i]; 
		     } 
		     s = s * 256 ; 
		   } 
		   if  (b[ 3 ] >=  0 ) { 
		     s = s + b[3 ]; 
		   } else  { 
		     s = s + 256  + b[ 3 ]; 
		   } 
		   return  s; 
		}

		  
		  
		public   static   int  lBytesToInt( byte [] b) { 
		   int  s =  0 ; 
		   for  ( int  i =  0 ; i <  3 ; i++) { 
		     if  (b[ 3 -i] >=  0 ) { 
		     s = s + b[3 -i]; 
		     } else  { 
		     s = s + 256  + b[ 3 -i]; 
		     } 
		     s = s * 256 ; 
		   } 
		   if  (b[ 0 ] >=  0 ) { 
		     s = s + b[0 ]; 
		   } else  { 
		     s = s + 256  + b[ 0 ]; 
		   } 
		   return  s; 
		}  
		  
		  
		  
		public   static   short  hBytesToShort( byte [] b) { 
		   int  s =  0 ; 
		   if  (b[ 0 ] >=  0 ) { 
		     s = s + b[0 ]; 
		     } else  { 
		     s = s + 256  + b[ 0 ]; 
		     } 
		     s = s * 256 ; 
		   if  (b[ 1 ] >=  0 ) { 
		     s = s + b[1 ]; 
		   } else  { 
		     s = s + 256  + b[ 1 ]; 
		   } 
		   short  result = ( short )s; 
		   return  result; 
		}

		  
		  
		public   static   short  lBytesToShort( byte [] b) { 
		   int  s =  0 ; 
		   if  (b[ 1 ] >=  0 ) { 
		     s = s + b[1 ]; 
		     } else  { 
		     s = s + 256  + b[ 1 ]; 
		     } 
		     s = s * 256 ; 
		   if  (b[ 0 ] >=  0 ) { 
		     s = s + b[0 ]; 
		   } else  { 
		     s = s + 256  + b[ 0 ]; 
		   } 
		   short  result = ( short )s; 
		   return  result; 
		}

		 public static long bytesToLong(byte[] b) { 
		        long s = 0; 
		        long s0 = b[0] & 0xff;// 最低位 
		        long s1 = b[1] & 0xff; 
		        long s2 = b[2] & 0xff; 
		        long s3 = b[3] & 0xff; 
		        long s4 = b[4] & 0xff;// 最低位 
		        long s5 = b[5] & 0xff; 
		        long s6 = b[6] & 0xff; 
		        long s7 = b[7] & 0xff; 
		 
		        // s0不变 
		        s1 <<= 8; 
		        s2 <<= 16; 
		        s3 <<= 24; 
		        s4 <<= 8 * 4; 
		        s5 <<= 8 * 5; 
		        s6 <<= 8 * 6; 
		        s7 <<= 8 * 7; 
		        s = s0 | s1 | s2 | s3 | s4 | s5 | s6 | s7; 
		        return s; 
		    }  
		  
		public   static   float  hBytesToFloat( byte [] b) { 
		   int  i =  0 ; 
		   Float F = new  Float( 0.0 ); 
		   i = ((((b[0 ]& 0xff )<< 8  | (b[ 1 ]& 0xff ))<< 8 ) | (b[ 2 ]& 0xff ))<< 8  | (b[ 3 ]& 0xff ); 
		   return  F.intBitsToFloat(i); 
		}

		  
		  
		public   static   float  lBytesToFloat( byte [] b) { 
		   int  i =  0 ; 
		   Float F = new  Float( 0.0 ); 
		   i = ((((b[3 ]& 0xff )<< 8  | (b[ 2 ]& 0xff ))<< 8 ) | (b[ 1 ]& 0xff ))<< 8  | (b[ 0 ]& 0xff ); 
		   return  F.intBitsToFloat(i); 
		}

		  
		  
		public   static   byte [] bytesReverseOrder( byte [] b) { 
		   int  length = b.length; 
		   byte [] result =  new   byte [length]; 
		   for ( int  i= 0 ; i< length; i++) { 
		     result[length-i-1 ] = b[i]; 
		   } 
		   return  result; 
		}

		  
		  
		public   static   void  printBytes( byte [] bb) { 
		   int  length = bb.length; 
		   for  ( int  i= 0 ; i< length; i++) { 
		     System.out.print(bb + " " ); 
		   } 
		   System.out.println("" ); 
		}  
		  
		public   static   void  logBytes( byte [] bb) { 
		   int  length = bb.length; 
		   String out = "" ; 
		   for  ( int  i= 0 ; i< length; i++) { 
		     out = out + bb + " " ; 
		   }  
		  
		}  
		  
		  
		public   static   int  reverseInt( int  i) { 
		   int  result = FormatTransfer.hBytesToInt(FormatTransfer.toLH(i)); 
		   return  result; 
		}  
		  
		  
		public   static   short  reverseShort( short  s) { 
		   short  result = FormatTransfer.hBytesToShort(FormatTransfer.toLH(s)); 
		   return  result; 
		}  
		  
		  
		public   static   float  reverseFloat( float  f) { 
		   float  result = FormatTransfer.hBytesToFloat(FormatTransfer.toLH(f)); 
		   return  result; 
		}  
		
		public static long reverseLong(long l){
			long result=FormatTransfer.bytesToLong(FormatTransfer.toHH(l));
			return result;		
		}
		  
		
}
