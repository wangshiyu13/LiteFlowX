// This is a generated file. Not intended for manual editing.
package top.xystudio.plugin.idea.liteflowx.system.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static top.xystudio.plugin.idea.liteflowx.system.language.psi.LiteFlowTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import top.xystudio.plugin.idea.liteflowx.system.language.psi.*;

public class LiteFlowLiteFlowWhenSubExpressImpl extends ASTWrapperPsiElement implements LiteFlowLiteFlowWhenSubExpress {

  public LiteFlowLiteFlowWhenSubExpressImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LiteFlowVisitor visitor) {
    visitor.visitLiteFlowWhenSubExpress(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LiteFlowVisitor) accept((LiteFlowVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public LiteFlowLiteFlowAnyExpress getLiteFlowAnyExpress() {
    return findChildByClass(LiteFlowLiteFlowAnyExpress.class);
  }

  @Override
  @Nullable
  public LiteFlowLiteFlowIdExpress getLiteFlowIdExpress() {
    return findChildByClass(LiteFlowLiteFlowIdExpress.class);
  }

  @Override
  @Nullable
  public LiteFlowLiteFlowIgnoreErrorExpress getLiteFlowIgnoreErrorExpress() {
    return findChildByClass(LiteFlowLiteFlowIgnoreErrorExpress.class);
  }

  @Override
  @Nullable
  public LiteFlowLiteFlowThreadPoolExpress getLiteFlowThreadPoolExpress() {
    return findChildByClass(LiteFlowLiteFlowThreadPoolExpress.class);
  }

}
