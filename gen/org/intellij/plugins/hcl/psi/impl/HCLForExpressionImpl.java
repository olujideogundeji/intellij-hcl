// This is a generated file. Not intended for manual editing.
package org.intellij.plugins.hcl.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.plugins.hcl.HCLElementTypes.*;
import org.intellij.plugins.hcl.psi.*;

public class HCLForExpressionImpl extends HCLExpressionImpl implements HCLForExpression {

  public HCLForExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull HCLElementVisitor visitor) {
    visitor.visitForExpression(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HCLElementVisitor) accept((HCLElementVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HCLExpression getExpression() {
    return findChildByClass(HCLExpression.class);
  }

  @Override
  @NotNull
  public HCLForIntro getIntro() {
    return findNotNullChildByClass(HCLForIntro.class);
  }

  @Override
  @Nullable
  public HCLForCondition getCondition() {
    return findChildByClass(HCLForCondition.class);
  }

}
