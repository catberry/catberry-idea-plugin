package org.buffagon.intellij.catberry.components;

import com.intellij.patterns.PlatformPatterns;
import com.intellij.psi.*;
import com.intellij.psi.html.HtmlTag;
import com.intellij.util.ProcessingContext;
import org.buffagon.intellij.catberry.CatberryConstants;
import org.jetbrains.annotations.NotNull;

/**
 * @author Prokofiev Alex
 */
public class CatberryComponentReferenceContributor extends PsiReferenceContributor {
  @Override
  public void registerReferenceProviders(@NotNull PsiReferenceRegistrar registrar) {
    registrar.registerReferenceProvider(PlatformPatterns.psiElement(HtmlTag.class),
        new PsiReferenceProvider() {
          @NotNull
          @Override
          public PsiReference[] getReferencesByElement(@NotNull PsiElement element, @NotNull ProcessingContext context) {
            HtmlTag htmlTag = (HtmlTag) element;
            String name = CatberryComponentUtils.normalizeName(htmlTag.getName());
            return new PsiReference[]{new CatberryComponentReference(htmlTag, name)};
          }
        });
  }
}
