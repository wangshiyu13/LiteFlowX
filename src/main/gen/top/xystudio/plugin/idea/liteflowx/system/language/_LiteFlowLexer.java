/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

package top.xystudio.plugin.idea.liteflowx.system.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static top.xystudio.plugin.idea.liteflowx.system.language.psi.LiteFlowTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>_LiteFlowLexer.flex</tt>
 */
public class _LiteFlowLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [10, 6, 5]
   * Total runtime size is 4224 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[(ZZ_CMAP_Z[ch>>11]<<6)|((ch>>5)&0x3f)]<<5)|(ch&0x1f)];
  }

  /* The ZZ_CMAP_Z table has 544 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\15\5\1\7\1\10\11\5\1\11\1\12\1\5\1\13\1\14\11"+
    "\5\1\15\14\5\1\16\2\5\1\17\u01e2\5");

  /* The ZZ_CMAP_Y table has 1024 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\55\6\1\7\3\6\1\10\6\6\1\7\14\6\1\11\3\6\1\11\3\6"+
    "\1\11\3\6\1\11\3\6\1\11\3\6\1\11\3\6\1\11\3\6\1\11\3\6\1\11\3\6\1\11\2\6\1"+
    "\10\3\6\1\10\2\6\1\7\10\6\1\7\1\6\1\10\57\6\1\5\12\6\1\7\1\10\11\6\1\11\3"+
    "\6\1\10\5\6\1\12\5\6\1\10\2\6\1\10\4\6\1\12\35\6\1\13\1\14\1\15\175\6\1\5"+
    "\160\6\1\7\24\6\1\10\1\6\1\7\5\6\2\10\2\6\1\10\14\6\1\10\130\6\1\10\54\6\1"+
    "\7\35\6\1\11\3\6\1\10\1\6\1\16\4\6\1\10\10\6\1\10\12\6\1\10\3\6\1\10\13\6"+
    "\1\10\3\6\1\7\2\6\1\10\15\6\1\7\32\6\1\10\60\6\1\7\6\6\1\10\143\6\1\17\1\20"+
    "\12\6\1\10\65\6");

  /* The ZZ_CMAP_A table has 544 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\4\1\2\2\1\1\3\22\0\1\4\1\41\1\14\1\0\1\5\1\46\1\43\1\12\1\33\1\34"+
    "\1\11\1\26\1\37\1\15\1\24\1\10\1\16\11\20\1\35\1\36\1\44\1\40\1\47\1\50\1"+
    "\0\1\75\1\21\1\104\1\101\1\25\1\111\1\7\1\71\1\106\2\7\1\112\1\23\1\22\1\7"+
    "\1\107\1\7\1\110\1\105\1\72\1\7\1\103\1\70\1\17\1\113\1\7\1\31\1\13\1\32\1"+
    "\45\1\7\1\0\1\60\1\76\1\100\1\64\1\56\1\57\1\114\1\67\1\65\1\7\1\77\1\53\1"+
    "\62\1\51\1\63\1\74\1\7\1\55\1\61\1\54\1\52\1\7\1\66\1\73\1\102\1\7\1\27\1"+
    "\42\1\30\7\0\1\1\32\0\1\4\77\0\12\6\46\0\12\6\14\0\12\6\20\0\12\6\6\0\12\6"+
    "\6\0\13\4\35\0\2\1\5\0\1\4\57\0\1\4\26\0\12\6\16\0\62\6");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\2\1\1\6"+
    "\2\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26"+
    "\1\27\1\30\1\31\1\32\1\33\23\3\2\0\1\34"+
    "\3\0\1\35\1\7\1\0\1\7\2\0\1\7\1\36"+
    "\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
    "\6\3\1\47\15\3\1\50\1\51\1\52\14\3\1\0"+
    "\1\34\2\7\1\0\1\7\1\3\1\53\1\54\2\3"+
    "\1\55\6\3\1\56\1\3\1\57\3\3\1\60\1\61"+
    "\12\3\1\62\1\3\2\0\1\63\1\64\1\65\2\3"+
    "\1\66\11\3\1\67\1\70\2\3\1\71\4\3\1\0"+
    "\4\3\1\72\1\3\1\73\1\74\1\75\1\3\1\76"+
    "\1\77\1\100\4\3\1\101\1\3\1\102\5\3\1\103"+
    "\1\104\10\3\1\105\3\3\1\106\2\3\1\107\2\3"+
    "\1\110\2\3\1\111\3\3\1\112\1\3\1\113\5\3"+
    "\1\114";

  private static int [] zzUnpackAction() {
    int [] result = new int[233];
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
    "\0\0\0\115\0\232\0\347\0\u0134\0\115\0\u0181\0\u01ce"+
    "\0\u021b\0\u0268\0\u02b5\0\115\0\u0302\0\115\0\115\0\115"+
    "\0\115\0\115\0\115\0\115\0\115\0\115\0\u034f\0\u039c"+
    "\0\u03e9\0\u0436\0\u0483\0\115\0\115\0\u04d0\0\115\0\u051d"+
    "\0\u056a\0\u05b7\0\u0604\0\u0651\0\u069e\0\u06eb\0\u0738\0\u0785"+
    "\0\u07d2\0\u081f\0\u086c\0\u08b9\0\u0906\0\u0953\0\u09a0\0\u09ed"+
    "\0\u0a3a\0\u0a87\0\u0ad4\0\u0181\0\115\0\u0b21\0\u01ce\0\u0b6e"+
    "\0\115\0\u0bbb\0\u0c08\0\115\0\u0c55\0\u0ca2\0\u0cef\0\115"+
    "\0\115\0\115\0\115\0\115\0\115\0\115\0\115\0\115"+
    "\0\u0d3c\0\u0d89\0\u0dd6\0\u0e23\0\u0e70\0\u0ebd\0\347\0\u0f0a"+
    "\0\u0f57\0\u0fa4\0\u0ff1\0\u103e\0\u108b\0\u10d8\0\u1125\0\u1172"+
    "\0\u11bf\0\u120c\0\u1259\0\u12a6\0\347\0\347\0\347\0\u12f3"+
    "\0\u1340\0\u138d\0\u13da\0\u1427\0\u1474\0\u14c1\0\u150e\0\u155b"+
    "\0\u15a8\0\u15f5\0\u1642\0\u168f\0\u01ce\0\u0c08\0\u16dc\0\u1729"+
    "\0\u1776\0\u17c3\0\347\0\347\0\u1810\0\u185d\0\347\0\u18aa"+
    "\0\u18f7\0\u1944\0\u1991\0\u19de\0\u1a2b\0\347\0\u1a78\0\347"+
    "\0\u1ac5\0\u1b12\0\u1b5f\0\347\0\347\0\u1bac\0\u1bf9\0\u1c46"+
    "\0\u1c93\0\u1ce0\0\u1d2d\0\u1d7a\0\u1dc7\0\u1e14\0\u1e61\0\347"+
    "\0\u1eae\0\u1efb\0\u1f48\0\347\0\347\0\347\0\u1f95\0\u1fe2"+
    "\0\347\0\u202f\0\u207c\0\u20c9\0\u2116\0\u2163\0\u21b0\0\u21fd"+
    "\0\u224a\0\u2297\0\347\0\347\0\u22e4\0\u2331\0\347\0\u237e"+
    "\0\u23cb\0\u2418\0\u2465\0\u24b2\0\u24ff\0\u254c\0\u2599\0\u25e6"+
    "\0\347\0\u2633\0\347\0\347\0\347\0\u2680\0\347\0\347"+
    "\0\347\0\u26cd\0\u271a\0\u2767\0\u27b4\0\u168f\0\u2801\0\347"+
    "\0\u284e\0\u289b\0\u28e8\0\u2935\0\u2982\0\347\0\347\0\u29cf"+
    "\0\u2a1c\0\u2a69\0\u2ab6\0\u2b03\0\u2b50\0\u2b9d\0\u2bea\0\347"+
    "\0\u2c37\0\u2c84\0\u2cd1\0\347\0\u2d1e\0\u2d6b\0\347\0\u2db8"+
    "\0\u2e05\0\347\0\u2e52\0\u2e9f\0\347\0\u2eec\0\u2f39\0\u2f86"+
    "\0\347\0\u2fd3\0\347\0\u3020\0\u306d\0\u30ba\0\u3107\0\u3154"+
    "\0\347";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[233];
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
    "\1\2\4\3\1\4\1\2\1\4\1\5\1\6\1\7"+
    "\1\2\1\10\1\11\1\12\1\4\1\13\3\4\1\14"+
    "\1\4\1\15\1\16\1\17\1\20\1\21\1\22\1\23"+
    "\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\4\1\41\1\42"+
    "\1\43\1\44\1\45\1\46\1\4\1\47\1\4\1\50"+
    "\1\51\1\52\1\4\1\53\1\4\1\54\3\4\1\55"+
    "\1\4\1\56\2\4\1\57\1\4\1\60\1\4\1\61"+
    "\1\4\1\62\3\4\116\0\4\3\116\0\2\4\6\0"+
    "\6\4\1\0\1\4\23\0\44\4\11\0\1\63\103\0"+
    "\12\64\1\65\1\66\101\64\13\67\1\70\1\65\100\67"+
    "\15\0\1\71\1\12\1\0\1\13\112\0\1\72\1\73"+
    "\1\72\2\0\1\74\1\75\1\76\30\0\1\76\14\0"+
    "\1\73\37\0\1\13\1\0\1\13\1\0\1\77\1\74"+
    "\1\75\1\76\30\0\1\76\64\0\1\100\126\0\1\101"+
    "\114\0\1\102\116\0\1\103\115\0\1\104\111\0\1\105"+
    "\3\0\1\106\110\0\1\107\6\0\1\110\53\0\2\4"+
    "\6\0\6\4\1\0\1\4\23\0\1\4\1\111\3\4"+
    "\1\112\4\4\1\113\31\4\6\0\2\4\6\0\6\4"+
    "\1\0\1\4\23\0\14\4\1\114\27\4\6\0\2\4"+
    "\6\0\6\4\1\0\1\4\23\0\4\4\1\115\2\4"+
    "\1\116\2\4\1\117\3\4\1\120\25\4\6\0\2\4"+
    "\6\0\6\4\1\0\1\4\23\0\5\4\1\121\36\4"+
    "\6\0\2\4\6\0\6\4\1\0\1\4\23\0\2\4"+
    "\1\122\17\4\1\123\21\4\6\0\2\4\6\0\6\4"+
    "\1\0\1\4\23\0\1\4\1\124\5\4\1\125\2\4"+
    "\1\126\31\4\6\0\2\4\6\0\6\4\1\0\1\4"+
    "\23\0\1\127\1\4\1\130\1\4\1\131\37\4\6\0"+
    "\2\4\6\0\6\4\1\0\1\4\23\0\7\4\1\132"+
    "\2\4\1\133\31\4\6\0\2\4\6\0\6\4\1\0"+
    "\1\4\23\0\5\4\1\134\36\4\6\0\2\4\6\0"+
    "\6\4\1\0\1\4\23\0\1\135\5\4\1\136\4\4"+
    "\1\137\27\4\1\140\6\0\2\4\6\0\6\4\1\0"+
    "\1\4\23\0\16\4\1\141\25\4\6\0\2\4\6\0"+
    "\6\4\1\0\1\4\23\0\20\4\1\142\23\4\6\0"+
    "\2\4\6\0\6\4\1\0\1\4\23\0\20\4\1\143"+
    "\23\4\6\0\2\4\6\0\6\4\1\0\1\4\23\0"+
    "\4\4\1\144\37\4\6\0\2\4\6\0\6\4\1\0"+
    "\1\4\23\0\2\4\1\145\4\4\1\146\2\4\1\147"+
    "\31\4\6\0\2\4\6\0\6\4\1\0\1\4\23\0"+
    "\33\4\1\150\10\4\6\0\2\4\6\0\6\4\1\0"+
    "\1\4\23\0\17\4\1\151\24\4\6\0\2\4\6\0"+
    "\6\4\1\0\1\4\23\0\37\4\1\152\4\4\6\0"+
    "\2\4\6\0\6\4\1\0\1\4\23\0\35\4\1\153"+
    "\6\4\11\0\1\154\103\0\1\64\3\0\111\64\13\67"+
    "\1\70\1\155\100\67\16\0\1\72\1\0\1\72\2\0"+
    "\1\74\1\75\1\76\30\0\1\76\54\0\1\156\1\0"+
    "\2\156\3\0\1\156\30\0\3\156\3\0\1\156\10\0"+
    "\2\156\1\0\2\156\2\0\1\156\4\0\1\156\21\0"+
    "\1\157\1\0\1\157\111\0\1\160\1\161\1\0\1\161"+
    "\5\0\1\160\111\0\1\74\77\0\2\4\6\0\6\4"+
    "\1\0\1\4\23\0\2\4\1\162\41\4\6\0\2\4"+
    "\6\0\6\4\1\0\1\4\23\0\15\4\1\163\26\4"+
    "\6\0\2\4\6\0\6\4\1\0\1\4\23\0\4\4"+
    "\1\164\37\4\6\0\2\4\6\0\6\4\1\0\1\4"+
    "\23\0\26\4\1\165\15\4\6\0\2\4\6\0\6\4"+
    "\1\0\1\4\23\0\1\4\1\166\42\4\6\0\2\4"+
    "\6\0\6\4\1\0\1\4\23\0\43\4\1\167\6\0"+
    "\2\4\6\0\6\4\1\0\1\4\23\0\4\4\1\170"+
    "\37\4\6\0\2\4\6\0\6\4\1\0\1\4\23\0"+
    "\3\4\1\171\40\4\6\0\2\4\6\0\6\4\1\0"+
    "\1\4\23\0\10\4\1\172\33\4\6\0\2\4\6\0"+
    "\6\4\1\0\1\4\23\0\23\4\1\173\20\4\6\0"+
    "\2\4\6\0\6\4\1\0\1\4\23\0\1\174\43\4"+
    "\6\0\2\4\6\0\6\4\1\0\1\4\23\0\2\4"+
    "\1\175\41\4\6\0\2\4\6\0\6\4\1\0\1\4"+
    "\23\0\4\4\1\176\37\4\6\0\2\4\6\0\6\4"+
    "\1\0\1\4\23\0\12\4\1\177\16\4\1\200\12\4"+
    "\6\0\2\4\6\0\6\4\1\0\1\4\23\0\14\4"+
    "\1\201\27\4\6\0\2\4\6\0\6\4\1\0\1\4"+
    "\23\0\4\4\1\202\37\4\6\0\2\4\6\0\6\4"+
    "\1\0\1\4\23\0\27\4\1\203\14\4\6\0\2\4"+
    "\6\0\6\4\1\0\1\4\23\0\13\4\1\204\30\4"+
    "\6\0\2\4\6\0\6\4\1\0\1\4\23\0\6\4"+
    "\1\205\35\4\6\0\2\4\6\0\6\4\1\0\1\4"+
    "\23\0\1\206\43\4\6\0\2\4\6\0\6\4\1\0"+
    "\1\4\23\0\14\4\1\207\27\4\6\0\2\4\6\0"+
    "\6\4\1\0\1\210\23\0\44\4\6\0\2\4\6\0"+
    "\6\4\1\0\1\211\23\0\44\4\6\0\2\4\6\0"+
    "\6\4\1\0\1\4\23\0\5\4\1\212\36\4\6\0"+
    "\2\4\6\0\6\4\1\0\1\4\23\0\7\4\1\213"+
    "\34\4\6\0\2\4\6\0\6\4\1\0\1\4\23\0"+
    "\10\4\1\214\33\4\6\0\2\4\6\0\6\4\1\0"+
    "\1\4\23\0\1\215\43\4\6\0\2\4\6\0\6\4"+
    "\1\0\1\4\23\0\2\4\1\216\41\4\6\0\2\4"+
    "\6\0\6\4\1\0\1\4\23\0\35\4\1\217\6\4"+
    "\6\0\2\4\6\0\6\4\1\0\1\220\23\0\44\4"+
    "\6\0\2\4\6\0\4\4\1\221\1\4\1\0\1\4"+
    "\23\0\44\4\1\154\2\0\1\222\5\154\1\223\103\154"+
    "\16\0\1\157\1\0\1\157\2\0\1\74\1\0\1\76"+
    "\30\0\1\76\54\0\1\161\1\0\1\161\112\0\1\161"+
    "\1\0\1\161\2\0\1\74\77\0\2\4\6\0\6\4"+
    "\1\0\1\4\23\0\2\4\1\224\41\4\6\0\2\4"+
    "\6\0\6\4\1\0\1\4\23\0\5\4\1\225\36\4"+
    "\6\0\2\4\6\0\6\4\1\0\1\4\23\0\5\4"+
    "\1\226\36\4\6\0\2\4\6\0\6\4\1\0\1\4"+
    "\23\0\5\4\1\227\36\4\6\0\2\4\6\0\6\4"+
    "\1\0\1\4\23\0\1\4\1\230\42\4\6\0\2\4"+
    "\6\0\6\4\1\0\1\4\23\0\5\4\1\231\36\4"+
    "\6\0\2\4\6\0\6\4\1\0\1\4\23\0\12\4"+
    "\1\232\31\4\6\0\2\4\6\0\6\4\1\0\1\4"+
    "\23\0\27\4\1\233\14\4\6\0\2\4\6\0\6\4"+
    "\1\0\1\4\23\0\10\4\1\234\33\4\6\0\2\4"+
    "\6\0\6\4\1\0\1\4\23\0\1\235\43\4\6\0"+
    "\2\4\6\0\6\4\1\0\1\4\23\0\7\4\1\236"+
    "\34\4\6\0\2\4\6\0\6\4\1\0\1\4\23\0"+
    "\7\4\1\237\34\4\6\0\2\4\6\0\6\4\1\0"+
    "\1\4\23\0\4\4\1\240\37\4\6\0\2\4\6\0"+
    "\6\4\1\0\1\4\23\0\12\4\1\241\31\4\6\0"+
    "\2\4\6\0\6\4\1\0\1\4\23\0\2\4\1\242"+
    "\41\4\6\0\2\4\6\0\4\4\1\243\1\4\1\0"+
    "\1\4\23\0\44\4\6\0\2\4\6\0\4\4\1\244"+
    "\1\4\1\0\1\4\23\0\44\4\6\0\2\4\6\0"+
    "\6\4\1\0\1\4\23\0\7\4\1\245\34\4\6\0"+
    "\2\4\6\0\6\4\1\0\1\4\23\0\10\4\1\246"+
    "\33\4\6\0\2\4\6\0\6\4\1\0\1\4\23\0"+
    "\3\4\1\247\40\4\6\0\2\4\6\0\6\4\1\0"+
    "\1\4\23\0\3\4\1\250\40\4\6\0\2\4\6\0"+
    "\6\4\1\0\1\4\23\0\7\4\1\251\34\4\6\0"+
    "\2\4\6\0\6\4\1\0\1\4\23\0\21\4\1\252"+
    "\22\4\6\0\2\4\6\0\6\4\1\0\1\4\23\0"+
    "\24\4\1\253\17\4\2\0\1\154\112\0\1\154\2\0"+
    "\1\222\5\154\1\254\103\154\6\0\2\4\6\0\6\4"+
    "\1\0\1\4\23\0\7\4\1\255\34\4\6\0\2\4"+
    "\6\0\6\4\1\0\1\4\23\0\4\4\1\256\37\4"+
    "\6\0\2\4\6\0\6\4\1\0\1\4\23\0\4\4"+
    "\1\257\37\4\6\0\2\4\6\0\6\4\1\0\1\4"+
    "\23\0\3\4\1\260\40\4\6\0\2\4\6\0\6\4"+
    "\1\0\1\4\23\0\5\4\1\261\36\4\6\0\2\4"+
    "\6\0\6\4\1\0\1\4\23\0\31\4\1\262\12\4"+
    "\6\0\2\4\6\0\6\4\1\0\1\4\23\0\10\4"+
    "\1\263\33\4\6\0\2\4\6\0\6\4\1\0\1\4"+
    "\23\0\31\4\1\264\12\4\6\0\2\4\6\0\6\4"+
    "\1\0\1\4\23\0\12\4\1\265\31\4\6\0\2\4"+
    "\6\0\6\4\1\0\1\4\23\0\4\4\1\266\37\4"+
    "\6\0\2\4\6\0\6\4\1\0\1\4\23\0\5\4"+
    "\1\267\36\4\6\0\2\4\6\0\6\4\1\0\1\4"+
    "\23\0\26\4\1\270\15\4\6\0\2\4\6\0\6\4"+
    "\1\0\1\4\23\0\10\4\1\271\33\4\6\0\2\4"+
    "\6\0\6\4\1\0\1\4\23\0\14\4\1\272\27\4"+
    "\6\0\2\4\6\0\6\4\1\0\1\4\23\0\10\4"+
    "\1\273\33\4\6\0\2\4\6\0\6\4\1\0\1\4"+
    "\23\0\33\4\1\274\10\4\6\0\2\4\6\0\6\4"+
    "\1\0\1\4\23\0\41\4\1\275\2\4\1\154\2\0"+
    "\1\222\4\154\1\276\1\254\103\154\6\0\2\4\6\0"+
    "\6\4\1\0\1\4\23\0\13\4\1\277\30\4\6\0"+
    "\2\4\6\0\6\4\1\0\1\4\23\0\1\300\43\4"+
    "\6\0\2\4\6\0\6\4\1\0\1\4\23\0\3\4"+
    "\1\301\40\4\6\0\2\4\6\0\6\4\1\0\1\4"+
    "\23\0\14\4\1\302\27\4\6\0\2\4\6\0\6\4"+
    "\1\0\1\4\23\0\11\4\1\303\32\4\6\0\2\4"+
    "\6\0\6\4\1\0\1\4\23\0\5\4\1\304\36\4"+
    "\6\0\2\4\6\0\6\4\1\0\1\4\23\0\1\305"+
    "\43\4\6\0\2\4\6\0\6\4\1\0\1\4\23\0"+
    "\10\4\1\306\33\4\6\0\2\4\6\0\6\4\1\0"+
    "\1\4\23\0\20\4\1\307\23\4\6\0\2\4\6\0"+
    "\6\4\1\0\1\4\23\0\41\4\1\310\2\4\6\0"+
    "\2\4\6\0\6\4\1\0\1\4\23\0\36\4\1\311"+
    "\5\4\6\0\2\4\6\0\6\4\1\0\1\4\23\0"+
    "\24\4\1\312\3\4\1\313\13\4\6\0\2\4\6\0"+
    "\6\4\1\0\1\4\23\0\12\4\1\314\31\4\6\0"+
    "\2\4\6\0\6\4\1\0\1\4\23\0\12\4\1\315"+
    "\31\4\6\0\2\4\6\0\6\4\1\0\1\316\23\0"+
    "\44\4\6\0\2\4\6\0\6\4\1\0\1\4\23\0"+
    "\1\4\1\317\42\4\6\0\2\4\6\0\6\4\1\0"+
    "\1\4\23\0\42\4\1\320\1\4\6\0\2\4\6\0"+
    "\6\4\1\0\1\4\23\0\12\4\1\321\31\4\6\0"+
    "\2\4\6\0\6\4\1\0\1\4\23\0\2\4\1\322"+
    "\41\4\6\0\2\4\6\0\6\4\1\0\1\4\23\0"+
    "\5\4\1\323\36\4\6\0\2\4\6\0\6\4\1\0"+
    "\1\4\23\0\1\324\43\4\6\0\2\4\6\0\6\4"+
    "\1\0\1\4\23\0\1\4\1\325\42\4\6\0\2\4"+
    "\6\0\6\4\1\0\1\4\23\0\4\4\1\326\37\4"+
    "\6\0\2\4\6\0\6\4\1\0\1\4\23\0\5\4"+
    "\1\327\36\4\6\0\2\4\6\0\6\4\1\0\1\4"+
    "\23\0\12\4\1\330\31\4\6\0\2\4\6\0\6\4"+
    "\1\0\1\4\23\0\14\4\1\331\27\4\6\0\2\4"+
    "\6\0\6\4\1\0\1\4\23\0\6\4\1\332\35\4"+
    "\6\0\2\4\6\0\6\4\1\0\1\4\23\0\10\4"+
    "\1\333\33\4\6\0\2\4\6\0\6\4\1\0\1\4"+
    "\23\0\4\4\1\334\37\4\6\0\2\4\6\0\6\4"+
    "\1\0\1\4\23\0\2\4\1\335\41\4\6\0\2\4"+
    "\6\0\6\4\1\0\1\4\23\0\7\4\1\336\34\4"+
    "\6\0\2\4\6\0\4\4\1\337\1\4\1\0\1\4"+
    "\23\0\44\4\6\0\2\4\6\0\6\4\1\0\1\4"+
    "\23\0\12\4\1\340\31\4\6\0\2\4\6\0\6\4"+
    "\1\0\1\4\23\0\10\4\1\341\33\4\6\0\2\4"+
    "\6\0\6\4\1\0\1\4\23\0\5\4\1\342\36\4"+
    "\6\0\2\4\6\0\6\4\1\0\1\4\23\0\4\4"+
    "\1\343\37\4\6\0\2\4\6\0\6\4\1\0\1\4"+
    "\23\0\15\4\1\344\26\4\6\0\2\4\6\0\6\4"+
    "\1\0\1\4\23\0\24\4\1\345\17\4\6\0\2\4"+
    "\6\0\6\4\1\0\1\4\23\0\4\4\1\346\37\4"+
    "\6\0\2\4\6\0\6\4\1\0\1\4\23\0\4\4"+
    "\1\347\37\4\6\0\2\4\6\0\6\4\1\0\1\4"+
    "\23\0\7\4\1\350\34\4\6\0\2\4\6\0\6\4"+
    "\1\0\1\4\23\0\31\4\1\351\12\4";

  private static int [] zzUnpackTrans() {
    int [] result = new int[12705];
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
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\3\1\1\11\5\1\1\11\1\1\11\11"+
    "\5\1\2\11\1\1\1\11\23\1\2\0\1\11\3\0"+
    "\1\11\1\1\1\0\1\11\2\0\1\1\11\11\43\1"+
    "\1\0\3\1\1\0\41\1\2\0\30\1\1\0\75\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[233];
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
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  public _LiteFlowLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _LiteFlowLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
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
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
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
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
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
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return BAD_CHARACTER;
            } 
            // fall through
          case 77: break;
          case 2: 
            { return WHITE_SPACE;
            } 
            // fall through
          case 78: break;
          case 3: 
            { return LITEFLOW_IDENTIFIER;
            } 
            // fall through
          case 79: break;
          case 4: 
            { return LITEFLOW_QUOTIENT;
            } 
            // fall through
          case 80: break;
          case 5: 
            { return LITEFLOW_MUL;
            } 
            // fall through
          case 81: break;
          case 6: 
            { return LITEFLOW_MINUS;
            } 
            // fall through
          case 82: break;
          case 7: 
            { return LITEFLOW_NUMBER;
            } 
            // fall through
          case 83: break;
          case 8: 
            { return LITEFLOW_DOT;
            } 
            // fall through
          case 84: break;
          case 9: 
            { return LITEFLOW_PLUS;
            } 
            // fall through
          case 85: break;
          case 10: 
            { return LITEFLOW_BRACE_LEFT;
            } 
            // fall through
          case 86: break;
          case 11: 
            { return LITEFLOW_BRACE_RIGHT;
            } 
            // fall through
          case 87: break;
          case 12: 
            { return LITEFLOW_BRACK_LEFT;
            } 
            // fall through
          case 88: break;
          case 13: 
            { return LITEFLOW_BRACK_RIGHT;
            } 
            // fall through
          case 89: break;
          case 14: 
            { return LITEFLOW_PAREN_LEFT;
            } 
            // fall through
          case 90: break;
          case 15: 
            { return LITEFLOW_PAREN_RIGHT;
            } 
            // fall through
          case 91: break;
          case 16: 
            { return LITEFLOW_COLON;
            } 
            // fall through
          case 92: break;
          case 17: 
            { return LITEFLOW_SEMICOLON;
            } 
            // fall through
          case 93: break;
          case 18: 
            { return LITEFLOW_COMMA;
            } 
            // fall through
          case 94: break;
          case 19: 
            { return LITEFLOW_ASSIGN;
            } 
            // fall through
          case 95: break;
          case 20: 
            { return LITEFLOW_NOT;
            } 
            // fall through
          case 96: break;
          case 21: 
            { return LITEFLOW_BIT_OR;
            } 
            // fall through
          case 97: break;
          case 22: 
            { return LITEFLOW_BIT_AND;
            } 
            // fall through
          case 98: break;
          case 23: 
            { return LITEFLOW_LESS;
            } 
            // fall through
          case 99: break;
          case 24: 
            { return LITEFLOW_BIT_XOR;
            } 
            // fall through
          case 100: break;
          case 25: 
            { return LITEFLOW_REMAINDER;
            } 
            // fall through
          case 101: break;
          case 26: 
            { return LITEFLOW_GREATER;
            } 
            // fall through
          case 102: break;
          case 27: 
            { return LITEFLOW_QUESTION;
            } 
            // fall through
          case 103: break;
          case 28: 
            { return LITEFLOW_STRING;
            } 
            // fall through
          case 104: break;
          case 29: 
            { return LITEFLOW_MINUS_MINUS;
            } 
            // fall through
          case 105: break;
          case 30: 
            { return LITEFLOW_PLUS_PLUS;
            } 
            // fall through
          case 106: break;
          case 31: 
            { return LITEFLOW_EQ;
            } 
            // fall through
          case 107: break;
          case 32: 
            { return LITEFLOW_NOT_EQ;
            } 
            // fall through
          case 108: break;
          case 33: 
            { return LITEFLOW_COND_OR;
            } 
            // fall through
          case 109: break;
          case 34: 
            { return LITEFLOW_COND_AND;
            } 
            // fall through
          case 110: break;
          case 35: 
            { return LITEFLOW_LESS_OR_EQUAL;
            } 
            // fall through
          case 111: break;
          case 36: 
            { return LITEFLOW_SHIFT_LEFT;
            } 
            // fall through
          case 112: break;
          case 37: 
            { return LITEFLOW_GREATER_OR_EQUAL;
            } 
            // fall through
          case 113: break;
          case 38: 
            { return LITEFLOW_SHIFT_RIGHT;
            } 
            // fall through
          case 114: break;
          case 39: 
            { return LITEFLOW_TO;
            } 
            // fall through
          case 115: break;
          case 40: 
            { return LITEFLOW_IN;
            } 
            // fall through
          case 116: break;
          case 41: 
            { return LITEFLOW_IF;
            } 
            // fall through
          case 117: break;
          case 42: 
            { return LITEFLOW_ID;
            } 
            // fall through
          case 118: break;
          case 43: 
            { return LITEFLOW_NEW;
            } 
            // fall through
          case 119: break;
          case 44: 
            { return LITEFLOW_NOR;
            } 
            // fall through
          case 120: break;
          case 45: 
            { return LITEFLOW_TAG;
            } 
            // fall through
          case 121: break;
          case 46: 
            { return LITEFLOW_FOR;
            } 
            // fall through
          case 122: break;
          case 47: 
            { return LITEFLOW_ANY;
            } 
            // fall through
          case 123: break;
          case 48: 
            { return LITEFLOW_MOD;
            } 
            // fall through
          case 124: break;
          case 49: 
            { return LITEFLOW_DEF;
            } 
            // fall through
          case 125: break;
          case 50: 
            { return LITEFLOW_PRE;
            } 
            // fall through
          case 126: break;
          case 51: 
            { return LITEFLOW_NULL;
            } 
            // fall through
          case 127: break;
          case 52: 
            { return LITEFLOW_LIKE;
            } 
            // fall through
          case 128: break;
          case 53: 
            { return LITEFLOW_TRUE;
            } 
            // fall through
          case 129: break;
          case 54: 
            { return LITEFLOW_ELSE;
            } 
            // fall through
          case 130: break;
          case 55: 
            { return LITEFLOW_WHEN;
            } 
            // fall through
          case 131: break;
          case 56: 
            { return LITEFLOW_THEN;
            } 
            // fall through
          case 132: break;
          case 57: 
            { return LITEFLOW_CAST;
            } 
            // fall through
          case 133: break;
          case 58: 
            { return LITEFLOW_FALSE;
            } 
            // fall through
          case 134: break;
          case 59: 
            { return LITEFLOW_ALIAS;
            } 
            // fall through
          case 135: break;
          case 60: 
            { return LITEFLOW_ARRAY;
            } 
            // fall through
          case 136: break;
          case 61: 
            { return LITEFLOW_MACRO;
            } 
            // fall through
          case 137: break;
          case 62: 
            { return LITEFLOW_WHILE;
            } 
            // fall through
          case 138: break;
          case 63: 
            { return LITEFLOW_BREAK;
            } 
            // fall through
          case 139: break;
          case 64: 
            { return LITEFLOW_CLASS;
            } 
            // fall through
          case 140: break;
          case 65: 
            { return LITEFLOW_BLOCK_COMMENT;
            } 
            // fall through
          case 141: break;
          case 66: 
            { return LITEFLOW_RETURN;
            } 
            // fall through
          case 142: break;
          case 67: 
            { return LITEFLOW_VCLASS;
            } 
            // fall through
          case 143: break;
          case 68: 
            { return LITEFLOW_SWITCH;
            } 
            // fall through
          case 144: break;
          case 69: 
            { return LITEFLOW_FINALLY;
            } 
            // fall through
          case 145: break;
          case 70: 
            { return LITEFLOW_FUNCTION;
            } 
            // fall through
          case 146: break;
          case 71: 
            { return LITEFLOW_CONTINUE;
            } 
            // fall through
          case 147: break;
          case 72: 
            { return LITEFLOW_EXPORTDEF;
            } 
            // fall through
          case 148: break;
          case 73: 
            { return LITEFLOW_THREADPOOL;
            } 
            // fall through
          case 149: break;
          case 74: 
            { return LITEFLOW_EXPORTALIAS;
            } 
            // fall through
          case 150: break;
          case 75: 
            { return LITEFLOW_IGNOREERROR;
            } 
            // fall through
          case 151: break;
          case 76: 
            { return LITEFLOW_ANONYMOUSNEWARRAY;
            } 
            // fall through
          case 152: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
