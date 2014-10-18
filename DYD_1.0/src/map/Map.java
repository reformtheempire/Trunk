package map;

public class Map {

	private int numberOfCells;

	private static Cell[][] cells;

	public void setCells(Cell[][] cells) {
		Map.cells = cells;
	}

	public String displayMap() {
		StringBuilder sb = new StringBuilder();
		for (int y = 0; y < 9; y++) {
			for (int x = 0; x < 9; x++) {
				if(cells[y][x].isS()){
					sb.append("###");
				}else{
					sb.append("#*#");
				}
			}
			sb.append("\n");
				for (int k = 0; k < 9; k++) {
					if(cells[y][k].isW()){
						sb.append("#");
					}else{
						sb.append("*");
					}
					sb.append("*");
					if(cells[y][k].isE()){
						sb.append("#");
					}else{
						sb.append("*");
					}					
				}
			
			sb.append("\n");
		}
		
		
		
		return sb.toString();
	}
}
