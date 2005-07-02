/* The following code was generated by JFlex 1.4 on 05-05-29 20:13 */

package com.dawidweiss.carrot.util.tokenizer.parser.jflex;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4
 * on 05-05-29 20:13 from the specification file
 * <tt>E:/repositories/carrot/sourceforge.net/carrot2/components/carrot2-util-tokenizer/src/com/dawidweiss/carrot/util/tokenizer/parser/jflex/JFlexWordBasedParserImpl.jflex</tt>
 */
class JFlexWordBasedParserImpl {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\0\1\24\1\0\1\0\1\23\22\0\1\0\1\46\1\0"+
    "\1\47\2\0\1\41\1\30\4\0\1\45\1\32\1\33\1\34\12\26"+
    "\1\37\1\36\1\0\1\42\1\0\1\35\1\40\32\50\4\0\1\31"+
    "\1\0\1\21\1\14\1\16\1\12\1\11\1\5\1\7\1\43\1\2"+
    "\2\50\1\3\1\1\1\4\1\6\1\22\1\50\1\17\1\44\1\20"+
    "\1\13\1\10\3\50\1\15\105\0\27\25\1\0\37\25\1\0\u0568\25"+
    "\12\27\206\25\12\27\u026c\25\12\27\166\25\12\27\166\25\12\27\166\25"+
    "\12\27\166\25\12\27\167\25\11\27\166\25\12\27\166\25\12\27\166\25"+
    "\12\27\340\25\12\27\166\25\12\27\u0166\25\12\27\u0fb6\25\u1040\0\u0150\25"+
    "\u0170\0\200\25\200\0\u092e\25\u10d2\0\u5200\25\u5900\0\u0200\25\u0500\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\3\2\1\1\2\3\1\4\1\5\1\1"+
    "\3\2\5\0\1\2\2\3\5\0\1\2\2\0\2\2"+
    "\1\6\1\7\1\6\1\0\1\10\1\2\1\0\5\3"+
    "\1\2\13\0\1\2\2\0\1\10\2\0\2\3\1\10"+
    "\1\2\12\11\1\12\1\2\1\7\1\0\1\11\1\0"+
    "\2\6\1\2\5\0\1\3\1\13\2\0\1\13\2\0"+
    "\1\13\4\0\1\13\14\0\1\3\15\13\1\0\1\13"+
    "\2\0\1\13";

  private static int [] zzUnpackAction() {
    int [] result = new int[134];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\51\0\122\0\173\0\244\0\315\0\366\0\u011f"+
    "\0\51\0\u0148\0\u0171\0\u019a\0\u01c3\0\u01ec\0\u0215\0\u023e"+
    "\0\u0267\0\u0290\0\u02b9\0\u02e2\0\u030b\0\u0334\0\u035d\0\u0386"+
    "\0\u03af\0\u03d8\0\u0401\0\u042a\0\u0453\0\u047c\0\u04a5\0\u04ce"+
    "\0\u04f7\0\u0520\0\u0549\0\u0572\0\u059b\0\u05c4\0\u05ed\0\u0616"+
    "\0\u063f\0\u0668\0\u0691\0\u06ba\0\u06e3\0\u070c\0\u0735\0\u075e"+
    "\0\u0787\0\u07b0\0\u07d9\0\u0802\0\u082b\0\u0854\0\u087d\0\u08a6"+
    "\0\u08cf\0\u08f8\0\u0921\0\u0290\0\u094a\0\u0973\0\u099c\0\u09c5"+
    "\0\u03d8\0\u09ee\0\u0a17\0\u0a40\0\u0a69\0\u0a92\0\u0abb\0\u0ae4"+
    "\0\u0b0d\0\u0b36\0\u0b5f\0\u0b88\0\u0bb1\0\u0bda\0\u0c03\0\u0c2c"+
    "\0\u0c55\0\u0c7e\0\u0ca7\0\u0cd0\0\u0cf9\0\u0d22\0\u0d4b\0\u0d74"+
    "\0\u0d9d\0\u0dc6\0\u0def\0\u0e18\0\u0e41\0\u0e6a\0\u0e93\0\u0ebc"+
    "\0\u0ee5\0\u0f0e\0\u0f37\0\u0f60\0\u0f89\0\u0fb2\0\u0fdb\0\u1004"+
    "\0\u102d\0\u1056\0\u107f\0\u10a8\0\u10d1\0\u10fa\0\u1123\0\u114c"+
    "\0\u1175\0\u119e\0\u11c7\0\u11f0\0\u1219\0\u1242\0\u126b\0\u1294"+
    "\0\u12bd\0\u12e6\0\u130f\0\u1338\0\u1361\0\u138a\0\u13b3\0\u13dc"+
    "\0\u1405\0\u142e\0\u1457\0\u1480\0\u14a9\0\u14d2";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[134];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\3\4\1\5\15\4\1\6\1\2\1\4"+
    "\1\7\1\10\1\11\1\2\1\11\1\12\1\2\2\12"+
    "\1\11\1\2\1\13\1\2\1\14\1\4\1\11\1\12"+
    "\1\2\1\4\52\0\20\15\1\16\1\15\2\0\3\15"+
    "\1\17\1\20\1\21\1\22\5\0\1\23\1\0\2\15"+
    "\3\0\1\15\1\0\22\15\2\0\3\15\1\17\1\20"+
    "\1\21\1\22\5\0\1\23\1\0\2\15\3\0\1\15"+
    "\1\0\17\15\1\24\2\15\2\0\3\15\1\17\1\20"+
    "\1\21\1\22\5\0\1\23\1\0\2\15\3\0\1\15"+
    "\24\0\1\2\25\0\22\15\2\0\1\15\1\25\1\26"+
    "\1\0\1\20\1\27\2\30\2\0\1\30\3\0\2\15"+
    "\1\30\2\0\1\15\1\0\22\15\2\0\1\15\2\26"+
    "\1\17\1\20\1\31\1\32\1\30\2\0\1\30\1\0"+
    "\1\23\1\0\2\15\1\30\2\0\1\15\33\0\1\12"+
    "\1\0\2\12\7\0\1\12\3\0\22\33\3\0\1\33"+
    "\14\0\2\33\2\0\2\33\1\0\17\15\1\34\2\15"+
    "\2\0\3\15\1\17\1\20\1\21\1\22\5\0\1\23"+
    "\1\0\2\15\3\0\1\15\1\0\22\15\2\0\3\15"+
    "\1\17\1\20\1\21\1\35\4\0\1\36\1\23\1\0"+
    "\2\15\3\0\1\15\1\0\1\15\1\37\20\15\2\0"+
    "\3\15\1\17\1\20\1\21\1\35\4\0\1\36\1\23"+
    "\1\0\2\15\3\0\1\15\1\0\22\40\2\0\1\40"+
    "\1\0\1\40\13\0\2\40\3\0\1\40\1\0\22\41"+
    "\2\0\3\41\1\0\2\20\10\0\2\41\3\0\1\41"+
    "\1\0\22\42\2\0\1\42\1\43\1\42\1\0\2\20"+
    "\10\0\2\42\3\0\1\42\1\0\22\44\2\0\1\44"+
    "\1\0\1\44\13\0\2\44\3\0\1\44\1\0\22\45"+
    "\2\0\1\45\1\23\1\45\13\0\2\45\3\0\1\45"+
    "\1\0\21\15\1\46\2\0\3\15\1\17\1\20\1\21"+
    "\1\35\4\0\1\36\1\23\1\0\2\15\3\0\1\15"+
    "\1\0\22\15\2\0\1\15\1\25\1\26\1\0\1\20"+
    "\1\27\1\47\1\30\2\0\1\30\1\36\2\0\2\15"+
    "\1\30\2\0\1\15\1\0\22\15\2\0\1\15\2\26"+
    "\1\17\1\20\1\31\1\47\1\30\2\0\1\30\1\36"+
    "\1\23\1\0\2\15\1\30\2\0\1\15\1\0\22\41"+
    "\2\0\1\41\2\50\1\0\2\20\10\0\2\41\3\0"+
    "\1\41\26\0\2\51\22\0\22\42\2\0\1\42\1\52"+
    "\1\53\1\0\2\20\10\0\2\42\3\0\1\42\1\0"+
    "\22\44\2\0\1\44\1\51\1\54\13\0\2\44\3\0"+
    "\1\44\1\0\22\33\3\0\1\33\7\0\1\2\4\0"+
    "\2\33\2\0\2\33\1\0\17\15\1\55\2\15\2\0"+
    "\3\15\1\17\1\20\1\21\1\35\4\0\1\36\1\23"+
    "\1\0\2\15\3\0\1\15\1\0\1\56\1\57\1\60"+
    "\1\61\1\60\1\62\1\63\1\60\1\64\2\60\1\65"+
    "\1\60\1\66\2\60\1\67\1\60\2\0\1\60\1\20"+
    "\1\60\13\0\2\60\3\0\1\60\1\0\22\70\2\0"+
    "\3\70\13\0\2\70\3\0\1\70\1\0\2\15\1\71"+
    "\17\15\2\0\3\15\1\17\1\20\1\21\1\35\4\0"+
    "\1\36\1\23\1\0\2\15\3\0\1\15\1\0\22\40"+
    "\2\0\3\40\1\17\1\0\1\72\6\0\1\23\1\0"+
    "\2\40\3\0\1\40\1\0\22\41\2\0\3\41\1\0"+
    "\2\20\1\35\4\0\1\36\2\0\2\41\3\0\1\41"+
    "\1\0\22\42\2\0\3\42\1\73\1\20\1\21\1\35"+
    "\4\0\1\36\2\0\2\42\3\0\1\42\1\0\22\42"+
    "\2\0\1\42\1\43\1\42\1\0\2\20\1\35\4\0"+
    "\1\36\2\0\2\42\3\0\1\42\33\0\1\74\16\0"+
    "\22\45\2\0\3\45\1\75\10\0\1\23\1\0\2\45"+
    "\3\0\1\45\1\0\22\15\2\0\3\15\1\17\1\20"+
    "\1\21\1\35\3\0\1\76\1\36\1\23\1\0\2\15"+
    "\3\0\1\15\1\0\1\56\1\57\1\60\1\61\1\60"+
    "\1\62\1\63\1\60\1\64\2\60\1\65\1\60\1\66"+
    "\2\60\1\67\1\60\2\0\1\60\1\77\1\100\13\0"+
    "\2\60\3\0\1\60\1\0\22\41\2\0\1\41\2\50"+
    "\1\0\1\20\1\27\1\47\1\30\2\0\1\30\1\36"+
    "\2\0\2\41\1\30\2\0\1\41\26\0\2\51\2\0"+
    "\3\30\2\0\1\30\5\0\1\30\4\0\22\42\2\0"+
    "\1\42\1\52\1\53\1\0\1\20\1\27\1\47\1\30"+
    "\2\0\1\30\1\36\2\0\2\42\1\30\2\0\1\42"+
    "\1\0\22\42\2\0\1\42\2\53\1\73\1\20\1\31"+
    "\1\47\1\30\2\0\1\30\1\36\2\0\2\42\1\30"+
    "\2\0\1\42\26\0\2\51\2\0\1\30\1\101\1\30"+
    "\2\0\1\30\5\0\1\30\4\0\21\15\1\102\2\0"+
    "\3\15\1\17\1\20\1\21\1\35\4\0\1\36\1\23"+
    "\1\0\2\15\3\0\1\15\1\0\1\103\1\104\20\103"+
    "\2\0\1\103\1\41\1\103\1\0\2\20\10\0\2\103"+
    "\3\0\1\103\1\0\3\103\1\105\16\103\2\0\1\103"+
    "\1\41\1\103\1\0\2\20\10\0\2\103\3\0\1\103"+
    "\1\0\22\103\2\0\1\103\1\41\1\103\1\0\2\20"+
    "\10\0\2\103\3\0\1\103\1\0\10\103\1\106\11\103"+
    "\2\0\1\103\1\41\1\103\1\0\2\20\10\0\2\103"+
    "\3\0\1\103\1\0\16\103\1\107\3\103\2\0\1\103"+
    "\1\41\1\103\1\0\2\20\10\0\2\103\3\0\1\103"+
    "\1\0\5\103\1\110\14\103\2\0\1\103\1\41\1\103"+
    "\1\0\2\20\10\0\2\103\3\0\1\103\1\0\11\103"+
    "\1\111\10\103\2\0\1\103\1\41\1\103\1\0\2\20"+
    "\10\0\2\103\3\0\1\103\1\0\1\103\1\112\20\103"+
    "\2\0\1\103\1\41\1\103\1\0\2\20\10\0\2\103"+
    "\3\0\1\103\1\0\5\103\1\113\14\103\2\0\1\103"+
    "\1\41\1\103\1\0\2\20\10\0\2\103\3\0\1\103"+
    "\1\0\16\103\1\114\3\103\2\0\1\103\1\41\1\103"+
    "\1\0\2\20\10\0\2\103\3\0\1\103\1\0\22\115"+
    "\2\0\3\115\1\0\2\70\10\0\2\115\3\0\1\115"+
    "\1\0\17\15\1\116\2\15\2\0\3\15\1\17\1\20"+
    "\1\21\1\35\4\0\1\36\1\23\1\0\2\15\3\0"+
    "\1\15\1\0\22\117\2\0\1\117\1\72\1\117\13\0"+
    "\2\117\3\0\1\117\1\0\22\117\2\0\1\117\1\0"+
    "\1\117\13\0\2\117\3\0\1\117\1\0\22\45\2\0"+
    "\1\45\1\0\1\45\13\0\2\45\3\0\1\45\34\0"+
    "\1\120\15\0\22\41\2\0\1\41\2\50\1\0\1\20"+
    "\1\27\2\30\2\0\1\30\3\0\2\41\1\30\2\0"+
    "\1\41\1\0\22\103\2\0\1\103\1\50\1\121\1\0"+
    "\1\20\1\27\2\30\2\0\1\30\3\0\2\103\1\30"+
    "\2\0\1\103\1\0\22\15\2\0\3\15\1\17\1\20"+
    "\1\21\1\35\3\0\1\76\1\36\1\23\1\0\1\15"+
    "\1\46\3\0\1\15\1\0\22\41\2\0\3\41\1\0"+
    "\2\20\1\35\1\122\3\0\1\36\2\0\2\41\3\0"+
    "\1\41\1\0\2\41\1\103\17\41\2\0\3\41\1\0"+
    "\2\20\1\35\1\122\3\0\1\36\2\0\2\41\3\0"+
    "\1\41\1\0\4\41\1\123\15\41\2\0\3\41\1\0"+
    "\2\20\1\35\1\122\3\0\1\36\2\0\2\41\3\0"+
    "\1\41\1\0\17\41\1\103\2\41\2\0\3\41\1\0"+
    "\2\20\1\35\1\122\3\0\1\36\2\0\2\41\3\0"+
    "\1\41\1\0\6\41\1\103\13\41\2\0\3\41\1\0"+
    "\2\20\1\35\1\122\3\0\1\36\2\0\2\41\3\0"+
    "\1\41\1\0\7\41\1\103\12\41\2\0\3\41\1\0"+
    "\2\20\1\35\1\122\3\0\1\36\2\0\2\41\3\0"+
    "\1\41\1\0\12\41\1\103\7\41\2\0\3\41\1\0"+
    "\2\20\1\35\1\122\3\0\1\36\2\0\2\41\3\0"+
    "\1\41\1\0\14\41\1\103\5\41\2\0\3\41\1\0"+
    "\2\20\1\35\1\122\3\0\1\36\2\0\2\41\3\0"+
    "\1\41\1\0\1\103\21\41\2\0\3\41\1\0\2\20"+
    "\1\35\1\122\3\0\1\36\2\0\2\41\3\0\1\41"+
    "\1\0\21\41\1\124\2\0\3\41\1\0\2\20\1\35"+
    "\1\122\3\0\1\36\2\0\2\41\3\0\1\41\1\0"+
    "\22\115\2\0\3\115\1\0\2\70\1\36\7\0\2\115"+
    "\3\0\1\115\1\0\5\15\1\125\14\15\2\0\3\15"+
    "\1\17\1\20\1\21\1\35\4\0\1\36\1\23\1\0"+
    "\2\15\3\0\1\15\1\0\22\117\2\0\3\117\1\73"+
    "\1\0\1\72\10\0\2\117\3\0\1\117\34\0\1\126"+
    "\15\0\22\41\2\0\1\41\2\50\1\0\1\20\1\27"+
    "\1\47\1\127\2\0\1\30\1\36\2\0\2\41\1\30"+
    "\2\0\1\41\1\0\22\130\2\0\3\130\13\0\2\130"+
    "\3\0\1\130\1\0\5\41\1\103\14\41\2\0\3\41"+
    "\1\0\2\20\1\35\4\0\1\36\2\0\2\41\3\0"+
    "\1\41\1\0\20\41\1\103\1\41\2\0\3\41\1\0"+
    "\2\20\1\35\4\0\1\36\2\0\2\41\3\0\1\41"+
    "\1\0\22\15\2\0\3\15\1\17\1\20\1\21\1\35"+
    "\3\0\1\131\1\36\1\23\1\0\2\15\3\0\1\15"+
    "\1\0\22\132\2\0\3\132\13\0\2\132\3\0\1\132"+
    "\1\0\22\130\2\0\1\130\2\133\13\0\2\130\3\0"+
    "\1\130\1\0\22\134\2\0\3\134\1\0\2\130\10\0"+
    "\2\134\3\0\1\134\1\0\22\135\2\0\3\135\13\0"+
    "\2\135\3\0\1\135\1\0\22\136\2\0\3\136\1\0"+
    "\2\132\10\0\2\136\3\0\1\136\1\0\22\134\2\0"+
    "\1\134\2\137\1\0\1\130\1\140\2\30\2\0\1\30"+
    "\3\0\2\134\1\30\2\0\1\134\1\0\22\134\2\0"+
    "\3\134\1\0\2\130\1\141\1\142\1\143\5\0\2\134"+
    "\3\0\1\134\1\0\22\144\2\0\3\144\1\0\2\135"+
    "\10\0\2\144\3\0\1\144\1\0\22\136\2\0\3\136"+
    "\1\0\2\132\1\145\7\0\2\136\3\0\1\136\1\0"+
    "\22\134\2\0\1\134\2\137\1\0\1\130\1\140\1\146"+
    "\1\147\1\143\1\0\1\30\3\0\2\134\1\30\2\0"+
    "\1\134\1\0\22\134\2\0\1\134\2\137\1\0\2\130"+
    "\10\0\2\134\3\0\1\134\1\0\22\150\2\0\3\150"+
    "\13\0\2\150\3\0\1\150\1\0\22\130\2\0\3\130"+
    "\5\0\1\143\5\0\2\130\3\0\1\130\1\0\22\151"+
    "\2\0\3\151\13\0\2\151\3\0\1\151\1\0\22\144"+
    "\2\0\3\144\1\0\2\135\1\131\4\0\1\36\2\0"+
    "\2\144\3\0\1\144\1\0\1\152\1\153\1\154\1\155"+
    "\1\154\1\156\1\157\1\154\1\160\2\154\1\161\1\154"+
    "\1\162\2\154\1\163\1\154\2\0\1\154\1\132\1\154"+
    "\13\0\2\154\3\0\1\154\1\0\22\150\2\0\1\150"+
    "\2\164\13\0\2\150\3\0\1\150\1\0\22\130\2\0"+
    "\1\130\2\133\5\0\1\143\5\0\2\130\3\0\1\130"+
    "\1\0\22\165\2\0\3\165\1\0\2\150\10\0\2\165"+
    "\3\0\1\165\1\0\22\166\2\0\3\166\1\0\2\151"+
    "\10\0\2\166\3\0\1\166\1\0\1\167\1\170\20\167"+
    "\2\0\1\167\1\136\1\167\1\0\2\132\10\0\2\167"+
    "\3\0\1\167\1\0\3\167\1\171\16\167\2\0\1\167"+
    "\1\136\1\167\1\0\2\132\10\0\2\167\3\0\1\167"+
    "\1\0\22\167\2\0\1\167\1\136\1\167\1\0\2\132"+
    "\10\0\2\167\3\0\1\167\1\0\10\167\1\172\11\167"+
    "\2\0\1\167\1\136\1\167\1\0\2\132\10\0\2\167"+
    "\3\0\1\167\1\0\16\167\1\173\3\167\2\0\1\167"+
    "\1\136\1\167\1\0\2\132\10\0\2\167\3\0\1\167"+
    "\1\0\5\167\1\174\14\167\2\0\1\167\1\136\1\167"+
    "\1\0\2\132\10\0\2\167\3\0\1\167\1\0\11\167"+
    "\1\175\10\167\2\0\1\167\1\136\1\167\1\0\2\132"+
    "\10\0\2\167\3\0\1\167\1\0\1\167\1\176\20\167"+
    "\2\0\1\167\1\136\1\167\1\0\2\132\10\0\2\167"+
    "\3\0\1\167\1\0\5\167\1\177\14\167\2\0\1\167"+
    "\1\136\1\167\1\0\2\132\10\0\2\167\3\0\1\167"+
    "\1\0\16\167\1\200\3\167\2\0\1\167\1\136\1\167"+
    "\1\0\2\132\10\0\2\167\3\0\1\167\1\0\22\165"+
    "\2\0\1\165\2\201\1\0\1\150\1\202\2\30\2\0"+
    "\1\30\3\0\2\165\1\30\2\0\1\165\1\0\22\165"+
    "\2\0\3\165\1\0\2\150\1\0\1\203\1\143\5\0"+
    "\2\165\3\0\1\165\1\0\22\166\2\0\3\166\1\0"+
    "\2\151\3\0\5\143\2\166\3\0\1\166\1\0\22\136"+
    "\2\0\3\136\1\0\2\132\1\145\1\122\6\0\2\136"+
    "\3\0\1\136\1\0\2\136\1\167\17\136\2\0\3\136"+
    "\1\0\2\132\1\145\1\122\6\0\2\136\3\0\1\136"+
    "\1\0\4\136\1\204\15\136\2\0\3\136\1\0\2\132"+
    "\1\145\1\122\6\0\2\136\3\0\1\136\1\0\17\136"+
    "\1\167\2\136\2\0\3\136\1\0\2\132\1\145\1\122"+
    "\6\0\2\136\3\0\1\136\1\0\6\136\1\167\13\136"+
    "\2\0\3\136\1\0\2\132\1\145\1\122\6\0\2\136"+
    "\3\0\1\136\1\0\7\136\1\167\12\136\2\0\3\136"+
    "\1\0\2\132\1\145\1\122\6\0\2\136\3\0\1\136"+
    "\1\0\12\136\1\167\7\136\2\0\3\136\1\0\2\132"+
    "\1\145\1\122\6\0\2\136\3\0\1\136\1\0\14\136"+
    "\1\167\5\136\2\0\3\136\1\0\2\132\1\145\1\122"+
    "\6\0\2\136\3\0\1\136\1\0\1\167\21\136\2\0"+
    "\3\136\1\0\2\132\1\145\1\122\6\0\2\136\3\0"+
    "\1\136\1\0\21\136\1\205\2\0\3\136\1\0\2\132"+
    "\1\145\1\122\6\0\2\136\3\0\1\136\1\0\22\165"+
    "\2\0\1\165\2\201\1\0\1\150\1\202\1\30\1\206"+
    "\1\143\1\0\1\30\3\0\2\165\1\30\2\0\1\165"+
    "\1\0\22\165\2\0\1\165\2\201\1\0\2\150\10\0"+
    "\2\165\3\0\1\165\35\0\1\143\14\0\5\136\1\167"+
    "\14\136\2\0\3\136\1\0\2\132\1\145\7\0\2\136"+
    "\3\0\1\136\1\0\20\136\1\167\1\136\2\0\3\136"+
    "\1\0\2\132\1\145\7\0\2\136\3\0\1\136\26\0"+
    "\2\51\5\0\1\143\13\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5371];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\6\1\1\11\5\1\5\0\3\1\5\0"+
    "\1\1\2\0\5\1\1\0\2\1\1\0\6\1\13\0"+
    "\1\1\2\0\1\1\2\0\21\1\1\0\1\1\1\0"+
    "\3\1\5\0\2\1\2\0\1\1\2\0\1\1\4\0"+
    "\1\1\14\0\16\1\1\0\1\1\2\0\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[134];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /* user code: */
public static final int TERM           = 1;
public static final int NUMERIC        = 2;
public static final int SENTENCEMARKER = 3;
public static final int PUNCTUATION    = 4;
public static final int EMAIL          = 5;
public static final int ACRONYM        = 6;
public static final int FULL_URL       = 7;
public static final int BARE_URL       = 8;
public static final int FILE           = 9;
public static final int HYPHTERM       = 10;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  JFlexWordBasedParserImpl(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  JFlexWordBasedParserImpl(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 198) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzPushbackPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead < 0) {
      return true;
    }
    else {
      zzEndRead+= numRead;
      return false;
    }
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = zzPushbackPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public int getNextToken() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = zzLexicalState;


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 8: 
          { return ACRONYM;
          }
        case 12: break;
        case 11: 
          { return FULL_URL;
          }
        case 13: break;
        case 4: 
          { return PUNCTUATION;
          }
        case 14: break;
        case 1: 
          { ;
          }
        case 15: break;
        case 9: 
          { return BARE_URL;
          }
        case 16: break;
        case 6: 
          { return FILE;
          }
        case 17: break;
        case 7: 
          { return HYPHTERM;
          }
        case 18: break;
        case 2: 
          { return TERM;
          }
        case 19: break;
        case 10: 
          { return EMAIL;
          }
        case 20: break;
        case 3: 
          { return NUMERIC;
          }
        case 21: break;
        case 5: 
          { return SENTENCEMARKER;
          }
        case 22: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return YYEOF;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
