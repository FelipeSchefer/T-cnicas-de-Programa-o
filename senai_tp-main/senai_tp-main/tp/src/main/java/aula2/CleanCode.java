package aula2;

public class CleanCode {

		public boolean buscarChave(String id) throws Exception {
			if(isEmptyId(id)) {
//				System.out.println("Não Tem id");
				throw new Exception("Não Tem id");
			}
			
			System.out.println("Tem id");
			return true;
			
		}
		
		public boolean isEmptyId(String id) {
			return id == null || id.equals("");
		}
}
