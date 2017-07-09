package pmp.lupdup.general.util;

import java.io.File;

public class GeneraIdInternoAdjunto {
	public static String generaId() {
		long codigoA		= (long)(Math.random() * 1000000000000000000D);
		long codigoB		= (long)(Math.random() * 1000000000000000000D);
		long codigoC		= (long)(Math.random() * 1000000000000000000D);
		long codigoD		= (long)(Math.random() * 1000000000000000000D);
		String idInterno	= "" + codigoA + "" + codigoB + "" + codigoC + "" + codigoD;
		if(idInterno.length() > 38) {
//			System.out.println("Demo.main() A idInterno = " + idInterno + " idInterno.length=" + idInterno.length());
			idInterno	= idInterno.substring(0, 38);
//			System.out.println("Demo.main() B idInterno = " + idInterno + " idInterno.length=" + idInterno.length());
		}
		return idInterno;
	}
	
}
