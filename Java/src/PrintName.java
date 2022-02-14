import java.util.Scanner;

public class PrintName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		String s = sc.nextLine();
		
		System.out.println("Enter the font size");
		int n = sc.nextInt();

		s = s.toUpperCase();
		
		for(int k=0;k<=s.length()-1;k++)
		{
			char ch = s.charAt(k);
			int i, j;
			
				switch(ch) {
				
					case 'A': 
						
						for(j=1; j<=n; j++)
						{
							for(i=1; i<=n; i++)
							{
								if(i==1 && j>n/2||i==n && j>n/2||j==n/2||i+j==n/2+1||i-j==n/2)
								{
									System.out.print("*");
								} 
								else 
								{
									System.out.print(" ");
								}
						
							} // A column 
							System.out.println();
						} // A row
						break;
						
					case 'B':	
						for(j=1; j<=n; j++)
						{
							for(i=1; i<=n; i++)
							{
								if(j==1&&i!=n||j==n&&i!=n||i==1||j==n/2&&i!=n||i==n&&j!=1&&j!=n&&j!=n/2)
								{
									System.out.print("*");
								} 
								else 
								{
									System.out.print(" ");
								}
						
							} // B column 
							System.out.println();
						} // B row
						break;
						
					case 'C':
						for(j=1; j<=n; j++)
						{
							for(i=1; i<=n; i++)
							{
								if(j==1&&i!=1||i==1&&j!=1&&j!=n||j==n&&i!=1)
								{
									System.out.print("*");
								} 
								else 
								{
									System.out.print(" ");
								}
						
							} // C column 
							System.out.println();
						} // C row
						break;
						
					case 'D':
						for(j=1; j<=n; j++)
						{
							for(i=1; i<=n; i++)
							{
								if(i==1||i==n&&j!=1&&j!=n||j==1&&i!=n||j==n&&i!=n)
								{
									System.out.print("*");
								} 
								else 
								{
									System.out.print(" ");
								}
						
							} // D column 
							System.out.println();
						} // D row
						break;
						
					case 'E':
						for(j=1; j<=n; j++)
						{
							for(i=1; i<=n; i++)
							{
								if(j==1||j==n||i==1||j==n/2)
								{
									System.out.print("*");
								} 
								else 
								{
									System.out.print(" ");
								}
						
							} // E column 
							System.out.println();
						} // E row
						break;
						
					case 'F':
						for(j=1; j<=n; j++)
						{
							for(i=1; i<=n; i++)
							{
								if(j==1||i==1||j==n/2)
								{
									System.out.print("*");
								} 
								else 
								{
									System.out.print(" ");
								}
						
							} // F column 
							System.out.println();
						} // F row
						break;	
						
					case 'G':
						for(j=1; j<=n; j++)
						{
							for(i=1; i<=n; i++)
							{
								if(j==1&&i!=1||i==1&&j!=1&&j!=n||j==n/2||j==n&&i!=1||i==n&&j>n/2)
								{
									System.out.print("*");
								} 
								else 
								{
									System.out.print(" ");
								}
						
							} // G column 
							System.out.println();
						} // G row
						break;		
						
					case 'H':
						for(j=1; j<=n; j++)
						{
							for(i=1; i<=n; i++)
							{
								if(i==1||i==n||j==n/2)
								{
									System.out.print("*");
								} 
								else 
								{
									System.out.print(" ");
								}
						
							} // H column 
							System.out.println();
						} // H row
						break;
						
					case 'I':
						for(j=1; j<=n; j++)
						{
							for(i=1; i<=n; i++)
							{
								if(j==1||j==n||i==n/2)
								{
									System.out.print("*");
								} 
								else 
								{
									System.out.print(" ");
								}
						
							} // I column 
							System.out.println();
						} // I row
						break;
						
					case 'J':
						for(j=1; j<=n; j++)
						{
							for(i=1; i<=n; i++)
							{
								if(j==1||i==n/2+1||j==n&&i<=n/2+1||i==1&&j>n/2)
								{
									System.out.print("*");
								} 
								else 
								{
									System.out.print(" ");
								}
						
							} // J column 
							System.out.println();
						} // J row
						break;
						
					case 'K':
						for(j=1; j<=n; j++)
						{
							for(i=1; i<=n; i++)
							{
								if(i==1||i+j==n/2+1||j-i==n/2-1)
								{
									System.out.print("*");
								} 
								else 
								{
									System.out.print(" ");
								}
						
							} // K column 
							System.out.println();
						} // K row
						break;
						
					case 'L':
						for(j=1; j<=n; j++)
						{
							for(i=1; i<=n; i++)
							{
								if(i==1||j==n)
								{
									System.out.print("*");
								} 
								else 
								{
									System.out.print(" ");
								}
						
							} // L column 
							System.out.println();
						} // L row
						break;
						
					case 'M':
						for(j=1; j<=n; j++)
						{
							for(i=1; i<=n; i++)
							{
								if(i==1||i==n||i==j&&j<=n/2||i+j==n&&j<=n/2)
								{
									System.out.print("*");
								} 
								else 
								{
									System.out.print(" ");
								}
						
							} // M column 
							System.out.println();
						} // M row
						break;
						
					case 'N':
						for(j=1; j<=n; j++)
						{
							for(i=1; i<=n; i++)
							{
								if(i==1||i==n||i==j)
								{
									System.out.print("*");
								} 
								else 
								{
									System.out.print(" ");
								}
						
							} // N column 
							System.out.println();
						} // N row
						break;
						
					case 'O':
						for(j=1; j<=n; j++)
						{
							for(i=1; i<=n; i++)
							{
								if(i==1&& j!=1&& j!=n ||i==n&&j!=1&&j!=n ||j==1 &&i!=1&&i!=n||j==n&&i!=1&&i!=n)
								{
									System.out.print("*");
								} 
								else 
								{
									System.out.print(" ");
								}
						
							} // O column 
							System.out.println();
						} // O row
						break;
						
					case 'P':
						for(j=1; j<=n; j++)
						{
							for(i=1; i<=n; i++)
							{
								if(i==1||j==1&&i!=n||i==n&&j<n/2&&j!=1||j==n/2&&i!=n&&i!=2)
								{
									System.out.print("*");
								} 
								else 
								{
									System.out.print(" ");
								}
						
							} // P column 
							System.out.println();
						} // P row
						break;
						
					case 'Q':
						for(j=1; j<=n; j++)
						{
							for(i=1; i<=n; i++)
							{
								if(i==1&& j!=1&& j<n-2 ||i==n&&j!=1&&j<n-2 ||j==1 &&i!=1&&i!=n||j==n-2&&i>=2&&i<=n-1||i==2&&j==n-2||j==n&&i>n/2&&i!=n||i==n/2&&j==n-1)
								{
									System.out.print("*");
								} 
								else 
								{
									System.out.print(" ");
								}
						
							} // Q column 
							System.out.println();
						} // Q row
						break;
						
					case 'R':
						for(j=1; j<=n; j++)
						{
							for(i=1; i<=n; i++)
							{
								if(i==1||j==1&&i!=n||i==n&&j<n/2&&j!=1||j==n/2&&i!=n&&i!=2||j-i==n/2-2)
								{
									System.out.print("*");
								} 
								else 
								{
									System.out.print(" ");
								}
						
							} // R column 
							System.out.println();
						} // R row
						break;
						
					case 'S':
						for(j=1; j<=n; j++)
						{
							for(i=1; i<=n; i++)
							{
								if(j==1&& i!=1 || j==n/2&& i!=n&& i!=1 ||j==n && i!=n ||i==1&&j<=n/2 && j!=n/2 && j!=1 || i==n&&j>n/2 && j!=n)
								{
									System.out.print("*");
								} 
								else 
								{
									System.out.print(" ");
								}
						
							} // S column 
							System.out.println();
						} // S row
						break;
						
					case 'T':
						for(j=1; j<=n; j++)
						{
							for(i=1; i<=n; i++)
							{
								if(j==1||i==n/2)
								{
									System.out.print("*");
								} 
								else 
								{
									System.out.print(" ");
								}
						
							} // T column 
							System.out.println();
						} // T row
						break;
					
					case 'U':
						for(j=1; j<=n; j++)
						{
							for(i=1; i<=n; i++)
							{
								if(i==1&&j!=n||i==n&&j!=n||j==n&&i!=n&&i!=1)
								{
									System.out.print("*");
								} 
								else 
								{
									System.out.print(" ");
								}
						
							} // U column 
							System.out.println();
						} // U row
						break;
						
					case 'V':
						for(j=1; j<=n; j++)
						{
							for(i=1; i<=n; i++)
							{
								if(i==1 && j<=n/2|| j-i==n/2 && j>n/2||i+j==((n*3)/2)+1||i==n && j<=n/2)
								{
									System.out.print("*");
								} 
								else 
								{
									System.out.print(" ");
								}
						
							} // V column 
							System.out.println();
						} // V row
						break;
						
					case 'W':
						for(j=1; j<=n; j++)
						{
							for(i=1; i<=n; i++)
							{
								if(i==1&&j!=n||i==n&&j!=n||i==n/2 && j>=n/2||j==n&&i!=1&&i!=n)
								{
									System.out.print("*");
								} 
								else 
								{
									System.out.print(" ");
								}
						
							} // W column 
							System.out.println();
						} // W row
						break;
						
					case 'X':
						for(j=1; j<=n; j++)
						{
							for(i=1; i<=n; i++)
							{
								if(i==j || i+j==n+1)
								{
									System.out.print("*");
								} 
								else 
								{
									System.out.print(" ");
								}
						
							} // X column 
							System.out.println();
						} // X row
						break;
						
					case 'Y':
						for(j=1; j<=n; j++)
						{
							for(i=1; i<=n; i++)
							{
								if(i==j && j<=n/2 ||i+j==n && j<=n/2 || i==5 && j>n/2)
								{
									System.out.print("*");
								} 
								else 
								{
									System.out.print(" ");
								}
						
							} // Y column 
							System.out.println();
						} // Y row
						break;
						
					case 'Z':
						for(j=1; j<=n; j++)
						{
							for(i=1; i<=n; i++)
							{
								if(j==1 || j==n||i+j==n+1&&j!=1&&j!=n)
								{
									System.out.print("*");
								} 
								else 
								{
									System.out.print(" ");
								}
						
							} // Z column 
							System.out.println();
						} // Z row
						break;
						
					
				} // switch
					
							
		} // name length
		
	}// main method

}// class
