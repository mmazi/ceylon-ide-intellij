package org.intellij.plugins.ceylon.psi;

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;

import static org.intellij.plugins.ceylon.psi.CeylonPsi.*;

public class CeylonPsiVisitor extends PsiElementVisitor {

    @Override
    public void visitElement(PsiElement element) {
        super.visitElement(element);

        if (element instanceof IfComprehensionClausePsi) {
            visitIfComprehensionClausePsi((IfComprehensionClausePsi) element);
        }
        else if (element instanceof ForComprehensionClausePsi) {
            visitForComprehensionClausePsi((ForComprehensionClausePsi) element);
        }
        else if (element instanceof ExpressionComprehensionClausePsi) {
            visitExpressionComprehensionClausePsi((ExpressionComprehensionClausePsi) element);
        }
        else if (element instanceof ComprehensionClausePsi) {
            visitComprehensionClausePsi((ComprehensionClausePsi) element);
        }
        else if (element instanceof ComprehensionPsi) {
            visitComprehensionPsi((ComprehensionPsi) element);
        }
        else if (element instanceof IdentifierPsi) {
            visitIdentifierPsi((IdentifierPsi) element);
        }
        else if (element instanceof AnnotationListPsi) {
            visitAnnotationListPsi((AnnotationListPsi) element);
        }
        else if (element instanceof AnonymousAnnotationPsi) {
            visitAnonymousAnnotationPsi((AnonymousAnnotationPsi) element);
        }
        else if (element instanceof AnnotationPsi) {
            visitAnnotationPsi((AnnotationPsi) element);
        }
        else if (element instanceof StringTemplatePsi) {
            visitStringTemplatePsi((StringTemplatePsi) element);
        }
        else if (element instanceof DynamicPsi) {
            visitDynamicPsi((DynamicPsi) element);
        }
        else if (element instanceof TuplePsi) {
            visitTuplePsi((TuplePsi) element);
        }
        else if (element instanceof SequenceEnumerationPsi) {
            visitSequenceEnumerationPsi((SequenceEnumerationPsi) element);
        }
        else if (element instanceof SuperPsi) {
            visitSuperPsi((SuperPsi) element);
        }
        else if (element instanceof ThisPsi) {
            visitThisPsi((ThisPsi) element);
        }
        else if (element instanceof SelfExpressionPsi) {
            visitSelfExpressionPsi((SelfExpressionPsi) element);
        }
        else if (element instanceof QuotedLiteralPsi) {
            visitQuotedLiteralPsi((QuotedLiteralPsi) element);
        }
        else if (element instanceof StringLiteralPsi) {
            visitStringLiteralPsi((StringLiteralPsi) element);
        }
        else if (element instanceof CharLiteralPsi) {
            visitCharLiteralPsi((CharLiteralPsi) element);
        }
        else if (element instanceof FloatLiteralPsi) {
            visitFloatLiteralPsi((FloatLiteralPsi) element);
        }
        else if (element instanceof NaturalLiteralPsi) {
            visitNaturalLiteralPsi((NaturalLiteralPsi) element);
        }
        else if (element instanceof LiteralPsi) {
            visitLiteralPsi((LiteralPsi) element);
        }
        else if (element instanceof AtomPsi) {
            visitAtomPsi((AtomPsi) element);
        }
        else if (element instanceof InitializerExpressionPsi) {
            visitInitializerExpressionPsi((InitializerExpressionPsi) element);
        }
        else if (element instanceof LazySpecifierExpressionPsi) {
            visitLazySpecifierExpressionPsi((LazySpecifierExpressionPsi) element);
        }
        else if (element instanceof SpecifierExpressionPsi) {
            visitSpecifierExpressionPsi((SpecifierExpressionPsi) element);
        }
        else if (element instanceof SpecifierOrInitializerExpressionPsi) {
            visitSpecifierOrInitializerExpressionPsi((SpecifierOrInitializerExpressionPsi) element);
        }
        else if (element instanceof ObjectArgumentPsi) {
            visitObjectArgumentPsi((ObjectArgumentPsi) element);
        }
        else if (element instanceof AttributeArgumentPsi) {
            visitAttributeArgumentPsi((AttributeArgumentPsi) element);
        }
        else if (element instanceof MethodArgumentPsi) {
            visitMethodArgumentPsi((MethodArgumentPsi) element);
        }
        else if (element instanceof TypedArgumentPsi) {
            visitTypedArgumentPsi((TypedArgumentPsi) element);
        }
        else if (element instanceof SpecifiedArgumentPsi) {
            visitSpecifiedArgumentPsi((SpecifiedArgumentPsi) element);
        }
        else if (element instanceof NamedArgumentPsi) {
            visitNamedArgumentPsi((NamedArgumentPsi) element);
        }
        else if (element instanceof FunctionArgumentPsi) {
            visitFunctionArgumentPsi((FunctionArgumentPsi) element);
        }
        else if (element instanceof SpreadArgumentPsi) {
            visitSpreadArgumentPsi((SpreadArgumentPsi) element);
        }
        else if (element instanceof ListedArgumentPsi) {
            visitListedArgumentPsi((ListedArgumentPsi) element);
        }
        else if (element instanceof PositionalArgumentPsi) {
            visitPositionalArgumentPsi((PositionalArgumentPsi) element);
        }
        else if (element instanceof PositionalArgumentListPsi) {
            visitPositionalArgumentListPsi((PositionalArgumentListPsi) element);
        }
        else if (element instanceof SequencedArgumentPsi) {
            visitSequencedArgumentPsi((SequencedArgumentPsi) element);
        }
        else if (element instanceof NamedArgumentListPsi) {
            visitNamedArgumentListPsi((NamedArgumentListPsi) element);
        }
        else if (element instanceof ArgumentListPsi) {
            visitArgumentListPsi((ArgumentListPsi) element);
        }
        else if (element instanceof PackagePsi) {
            visitPackagePsi((PackagePsi) element);
        }
        else if (element instanceof OuterPsi) {
            visitOuterPsi((OuterPsi) element);
        }
        else if (element instanceof ElementRangePsi) {
            visitElementRangePsi((ElementRangePsi) element);
        }
        else if (element instanceof ElementPsi) {
            visitElementPsi((ElementPsi) element);
        }
        else if (element instanceof ElementOrRangePsi) {
            visitElementOrRangePsi((ElementOrRangePsi) element);
        }
        else if (element instanceof IndexExpressionPsi) {
            visitIndexExpressionPsi((IndexExpressionPsi) element);
        }
        else if (element instanceof SpreadOpPsi) {
            visitSpreadOpPsi((SpreadOpPsi) element);
        }
        else if (element instanceof SafeMemberOpPsi) {
            visitSafeMemberOpPsi((SafeMemberOpPsi) element);
        }
        else if (element instanceof MemberOpPsi) {
            visitMemberOpPsi((MemberOpPsi) element);
        }
        else if (element instanceof MemberOperatorPsi) {
            visitMemberOperatorPsi((MemberOperatorPsi) element);
        }
        else if (element instanceof QualifiedTypeExpressionPsi) {
            visitQualifiedTypeExpressionPsi((QualifiedTypeExpressionPsi) element);
        }
        else if (element instanceof QualifiedMemberExpressionPsi) {
            visitQualifiedMemberExpressionPsi((QualifiedMemberExpressionPsi) element);
        }
        else if (element instanceof QualifiedMemberOrTypeExpressionPsi) {
            visitQualifiedMemberOrTypeExpressionPsi((QualifiedMemberOrTypeExpressionPsi) element);
        }
        else if (element instanceof BaseTypeExpressionPsi) {
            visitBaseTypeExpressionPsi((BaseTypeExpressionPsi) element);
        }
        else if (element instanceof BaseMemberExpressionPsi) {
            visitBaseMemberExpressionPsi((BaseMemberExpressionPsi) element);
        }
        else if (element instanceof BaseMemberOrTypeExpressionPsi) {
            visitBaseMemberOrTypeExpressionPsi((BaseMemberOrTypeExpressionPsi) element);
        }
        else if (element instanceof StaticMemberOrTypeExpressionPsi) {
            visitStaticMemberOrTypeExpressionPsi((StaticMemberOrTypeExpressionPsi) element);
        }
        else if (element instanceof ExtendedTypeExpressionPsi) {
            visitExtendedTypeExpressionPsi((ExtendedTypeExpressionPsi) element);
        }
        else if (element instanceof MemberOrTypeExpressionPsi) {
            visitMemberOrTypeExpressionPsi((MemberOrTypeExpressionPsi) element);
        }
        else if (element instanceof ParameterizedExpressionPsi) {
            visitParameterizedExpressionPsi((ParameterizedExpressionPsi) element);
        }
        else if (element instanceof InvocationExpressionPsi) {
            visitInvocationExpressionPsi((InvocationExpressionPsi) element);
        }
        else if (element instanceof PostfixExpressionPsi) {
            visitPostfixExpressionPsi((PostfixExpressionPsi) element);
        }
        else if (element instanceof PrimaryPsi) {
            visitPrimaryPsi((PrimaryPsi) element);
        }
        else if (element instanceof ExpressionPsi) {
            visitExpressionPsi((ExpressionPsi) element);
        }
        else if (element instanceof ExpressionListPsi) {
            visitExpressionListPsi((ExpressionListPsi) element);
        }
        else if (element instanceof PostfixDecrementOpPsi) {
            visitPostfixDecrementOpPsi((PostfixDecrementOpPsi) element);
        }
        else if (element instanceof PostfixIncrementOpPsi) {
            visitPostfixIncrementOpPsi((PostfixIncrementOpPsi) element);
        }
        else if (element instanceof PostfixOperatorExpressionPsi) {
            visitPostfixOperatorExpressionPsi((PostfixOperatorExpressionPsi) element);
        }
        else if (element instanceof DecrementOpPsi) {
            visitDecrementOpPsi((DecrementOpPsi) element);
        }
        else if (element instanceof IncrementOpPsi) {
            visitIncrementOpPsi((IncrementOpPsi) element);
        }
        else if (element instanceof PrefixOperatorExpressionPsi) {
            visitPrefixOperatorExpressionPsi((PrefixOperatorExpressionPsi) element);
        }
        else if (element instanceof OfOpPsi) {
            visitOfOpPsi((OfOpPsi) element);
        }
        else if (element instanceof ExtendsPsi) {
            visitExtendsPsi((ExtendsPsi) element);
        }
        else if (element instanceof SatisfiesPsi) {
            visitSatisfiesPsi((SatisfiesPsi) element);
        }
        else if (element instanceof IsOpPsi) {
            visitIsOpPsi((IsOpPsi) element);
        }
        else if (element instanceof TypeOperatorExpressionPsi) {
            visitTypeOperatorExpressionPsi((TypeOperatorExpressionPsi) element);
        }
        else if (element instanceof PositiveOpPsi) {
            visitPositiveOpPsi((PositiveOpPsi) element);
        }
        else if (element instanceof NegativeOpPsi) {
            visitNegativeOpPsi((NegativeOpPsi) element);
        }
        else if (element instanceof NonemptyPsi) {
            visitNonemptyPsi((NonemptyPsi) element);
        }
        else if (element instanceof ExistsPsi) {
            visitExistsPsi((ExistsPsi) element);
        }
        else if (element instanceof NotOpPsi) {
            visitNotOpPsi((NotOpPsi) element);
        }
        else if (element instanceof UnaryOperatorExpressionPsi) {
            visitUnaryOperatorExpressionPsi((UnaryOperatorExpressionPsi) element);
        }
        else if (element instanceof InOpPsi) {
            visitInOpPsi((InOpPsi) element);
        }
        else if (element instanceof CompareOpPsi) {
            visitCompareOpPsi((CompareOpPsi) element);
        }
        else if (element instanceof SegmentOpPsi) {
            visitSegmentOpPsi((SegmentOpPsi) element);
        }
        else if (element instanceof RangeOpPsi) {
            visitRangeOpPsi((RangeOpPsi) element);
        }
        else if (element instanceof EntryOpPsi) {
            visitEntryOpPsi((EntryOpPsi) element);
        }
        else if (element instanceof IdenticalOpPsi) {
            visitIdenticalOpPsi((IdenticalOpPsi) element);
        }
        else if (element instanceof ThenOpPsi) {
            visitThenOpPsi((ThenOpPsi) element);
        }
        else if (element instanceof DefaultOpPsi) {
            visitDefaultOpPsi((DefaultOpPsi) element);
        }
        else if (element instanceof WithinOpPsi) {
            visitWithinOpPsi((WithinOpPsi) element);
        }
        else if (element instanceof ClosedBoundPsi) {
            visitClosedBoundPsi((ClosedBoundPsi) element);
        }
        else if (element instanceof OpenBoundPsi) {
            visitOpenBoundPsi((OpenBoundPsi) element);
        }
        else if (element instanceof BoundPsi) {
            visitBoundPsi((BoundPsi) element);
        }
        else if (element instanceof ScaleOpPsi) {
            visitScaleOpPsi((ScaleOpPsi) element);
        }
        else if (element instanceof SmallAsOpPsi) {
            visitSmallAsOpPsi((SmallAsOpPsi) element);
        }
        else if (element instanceof LargeAsOpPsi) {
            visitLargeAsOpPsi((LargeAsOpPsi) element);
        }
        else if (element instanceof SmallerOpPsi) {
            visitSmallerOpPsi((SmallerOpPsi) element);
        }
        else if (element instanceof LargerOpPsi) {
            visitLargerOpPsi((LargerOpPsi) element);
        }
        else if (element instanceof ComparisonOpPsi) {
            visitComparisonOpPsi((ComparisonOpPsi) element);
        }
        else if (element instanceof NotEqualOpPsi) {
            visitNotEqualOpPsi((NotEqualOpPsi) element);
        }
        else if (element instanceof EqualOpPsi) {
            visitEqualOpPsi((EqualOpPsi) element);
        }
        else if (element instanceof EqualityOpPsi) {
            visitEqualityOpPsi((EqualityOpPsi) element);
        }
        else if (element instanceof ComplementOpPsi) {
            visitComplementOpPsi((ComplementOpPsi) element);
        }
        else if (element instanceof XorOpPsi) {
            visitXorOpPsi((XorOpPsi) element);
        }
        else if (element instanceof UnionOpPsi) {
            visitUnionOpPsi((UnionOpPsi) element);
        }
        else if (element instanceof IntersectionOpPsi) {
            visitIntersectionOpPsi((IntersectionOpPsi) element);
        }
        else if (element instanceof BitwiseOpPsi) {
            visitBitwiseOpPsi((BitwiseOpPsi) element);
        }
        else if (element instanceof OrOpPsi) {
            visitOrOpPsi((OrOpPsi) element);
        }
        else if (element instanceof AndOpPsi) {
            visitAndOpPsi((AndOpPsi) element);
        }
        else if (element instanceof LogicalOpPsi) {
            visitLogicalOpPsi((LogicalOpPsi) element);
        }
        else if (element instanceof OrAssignOpPsi) {
            visitOrAssignOpPsi((OrAssignOpPsi) element);
        }
        else if (element instanceof AndAssignOpPsi) {
            visitAndAssignOpPsi((AndAssignOpPsi) element);
        }
        else if (element instanceof LogicalAssignmentOpPsi) {
            visitLogicalAssignmentOpPsi((LogicalAssignmentOpPsi) element);
        }
        else if (element instanceof ComplementAssignOpPsi) {
            visitComplementAssignOpPsi((ComplementAssignOpPsi) element);
        }
        else if (element instanceof XorAssignOpPsi) {
            visitXorAssignOpPsi((XorAssignOpPsi) element);
        }
        else if (element instanceof UnionAssignOpPsi) {
            visitUnionAssignOpPsi((UnionAssignOpPsi) element);
        }
        else if (element instanceof IntersectAssignOpPsi) {
            visitIntersectAssignOpPsi((IntersectAssignOpPsi) element);
        }
        else if (element instanceof BitwiseAssignmentOpPsi) {
            visitBitwiseAssignmentOpPsi((BitwiseAssignmentOpPsi) element);
        }
        else if (element instanceof RemainderAssignOpPsi) {
            visitRemainderAssignOpPsi((RemainderAssignOpPsi) element);
        }
        else if (element instanceof DivideAssignOpPsi) {
            visitDivideAssignOpPsi((DivideAssignOpPsi) element);
        }
        else if (element instanceof MultiplyAssignOpPsi) {
            visitMultiplyAssignOpPsi((MultiplyAssignOpPsi) element);
        }
        else if (element instanceof SubtractAssignOpPsi) {
            visitSubtractAssignOpPsi((SubtractAssignOpPsi) element);
        }
        else if (element instanceof AddAssignOpPsi) {
            visitAddAssignOpPsi((AddAssignOpPsi) element);
        }
        else if (element instanceof ArithmeticAssignmentOpPsi) {
            visitArithmeticAssignmentOpPsi((ArithmeticAssignmentOpPsi) element);
        }
        else if (element instanceof AssignOpPsi) {
            visitAssignOpPsi((AssignOpPsi) element);
        }
        else if (element instanceof AssignmentOpPsi) {
            visitAssignmentOpPsi((AssignmentOpPsi) element);
        }
        else if (element instanceof RemainderOpPsi) {
            visitRemainderOpPsi((RemainderOpPsi) element);
        }
        else if (element instanceof PowerOpPsi) {
            visitPowerOpPsi((PowerOpPsi) element);
        }
        else if (element instanceof QuotientOpPsi) {
            visitQuotientOpPsi((QuotientOpPsi) element);
        }
        else if (element instanceof ProductOpPsi) {
            visitProductOpPsi((ProductOpPsi) element);
        }
        else if (element instanceof DifferenceOpPsi) {
            visitDifferenceOpPsi((DifferenceOpPsi) element);
        }
        else if (element instanceof SumOpPsi) {
            visitSumOpPsi((SumOpPsi) element);
        }
        else if (element instanceof ArithmeticOpPsi) {
            visitArithmeticOpPsi((ArithmeticOpPsi) element);
        }
        else if (element instanceof BinaryOperatorExpressionPsi) {
            visitBinaryOperatorExpressionPsi((BinaryOperatorExpressionPsi) element);
        }
        else if (element instanceof OperatorExpressionPsi) {
            visitOperatorExpressionPsi((OperatorExpressionPsi) element);
        }
        else if (element instanceof TermPsi) {
            visitTermPsi((TermPsi) element);
        }
        else if (element instanceof VariablePsi) {
            visitVariablePsi((VariablePsi) element);
        }
        else if (element instanceof SatisfiesConditionPsi) {
            visitSatisfiesConditionPsi((SatisfiesConditionPsi) element);
        }
        else if (element instanceof IsConditionPsi) {
            visitIsConditionPsi((IsConditionPsi) element);
        }
        else if (element instanceof NonemptyConditionPsi) {
            visitNonemptyConditionPsi((NonemptyConditionPsi) element);
        }
        else if (element instanceof ExistsConditionPsi) {
            visitExistsConditionPsi((ExistsConditionPsi) element);
        }
        else if (element instanceof ExistsOrNonemptyConditionPsi) {
            visitExistsOrNonemptyConditionPsi((ExistsOrNonemptyConditionPsi) element);
        }
        else if (element instanceof BooleanConditionPsi) {
            visitBooleanConditionPsi((BooleanConditionPsi) element);
        }
        else if (element instanceof ConditionPsi) {
            visitConditionPsi((ConditionPsi) element);
        }
        else if (element instanceof ConditionListPsi) {
            visitConditionListPsi((ConditionListPsi) element);
        }
        else if (element instanceof WhileClausePsi) {
            visitWhileClausePsi((WhileClausePsi) element);
        }
        else if (element instanceof WhileStatementPsi) {
            visitWhileStatementPsi((WhileStatementPsi) element);
        }
        else if (element instanceof KeyValueIteratorPsi) {
            visitKeyValueIteratorPsi((KeyValueIteratorPsi) element);
        }
        else if (element instanceof ValueIteratorPsi) {
            visitValueIteratorPsi((ValueIteratorPsi) element);
        }
        else if (element instanceof ForIteratorPsi) {
            visitForIteratorPsi((ForIteratorPsi) element);
        }
        else if (element instanceof ForClausePsi) {
            visitForClausePsi((ForClausePsi) element);
        }
        else if (element instanceof ForStatementPsi) {
            visitForStatementPsi((ForStatementPsi) element);
        }
        else if (element instanceof CatchVariablePsi) {
            visitCatchVariablePsi((CatchVariablePsi) element);
        }
        else if (element instanceof ResourcePsi) {
            visitResourcePsi((ResourcePsi) element);
        }
        else if (element instanceof ResourceListPsi) {
            visitResourceListPsi((ResourceListPsi) element);
        }
        else if (element instanceof FinallyClausePsi) {
            visitFinallyClausePsi((FinallyClausePsi) element);
        }
        else if (element instanceof CatchClausePsi) {
            visitCatchClausePsi((CatchClausePsi) element);
        }
        else if (element instanceof TryClausePsi) {
            visitTryClausePsi((TryClausePsi) element);
        }
        else if (element instanceof TryCatchStatementPsi) {
            visitTryCatchStatementPsi((TryCatchStatementPsi) element);
        }
        else if (element instanceof SatisfiesCasePsi) {
            visitSatisfiesCasePsi((SatisfiesCasePsi) element);
        }
        else if (element instanceof IsCasePsi) {
            visitIsCasePsi((IsCasePsi) element);
        }
        else if (element instanceof MatchCasePsi) {
            visitMatchCasePsi((MatchCasePsi) element);
        }
        else if (element instanceof CaseItemPsi) {
            visitCaseItemPsi((CaseItemPsi) element);
        }
        else if (element instanceof CaseClausePsi) {
            visitCaseClausePsi((CaseClausePsi) element);
        }
        else if (element instanceof SwitchCaseListPsi) {
            visitSwitchCaseListPsi((SwitchCaseListPsi) element);
        }
        else if (element instanceof SwitchClausePsi) {
            visitSwitchClausePsi((SwitchClausePsi) element);
        }
        else if (element instanceof SwitchStatementPsi) {
            visitSwitchStatementPsi((SwitchStatementPsi) element);
        }
        else if (element instanceof ElseClausePsi) {
            visitElseClausePsi((ElseClausePsi) element);
        }
        else if (element instanceof IfClausePsi) {
            visitIfClausePsi((IfClausePsi) element);
        }
        else if (element instanceof IfStatementPsi) {
            visitIfStatementPsi((IfStatementPsi) element);
        }
        else if (element instanceof DynamicClausePsi) {
            visitDynamicClausePsi((DynamicClausePsi) element);
        }
        else if (element instanceof DynamicStatementPsi) {
            visitDynamicStatementPsi((DynamicStatementPsi) element);
        }
        else if (element instanceof ControlClausePsi) {
            visitControlClausePsi((ControlClausePsi) element);
        }
        else if (element instanceof ControlStatementPsi) {
            visitControlStatementPsi((ControlStatementPsi) element);
        }
        else if (element instanceof ExpressionStatementPsi) {
            visitExpressionStatementPsi((ExpressionStatementPsi) element);
        }
        else if (element instanceof SpecifierStatementPsi) {
            visitSpecifierStatementPsi((SpecifierStatementPsi) element);
        }
        else if (element instanceof AssertionPsi) {
            visitAssertionPsi((AssertionPsi) element);
        }
        else if (element instanceof ExecutableStatementPsi) {
            visitExecutableStatementPsi((ExecutableStatementPsi) element);
        }
        else if (element instanceof CompilerAnnotationPsi) {
            visitCompilerAnnotationPsi((CompilerAnnotationPsi) element);
        }
        else if (element instanceof StatementPsi) {
            visitStatementPsi((StatementPsi) element);
        }
        else if (element instanceof StatementOrArgumentPsi) {
            visitStatementOrArgumentPsi((StatementOrArgumentPsi) element);
        }
        else if (element instanceof BreakPsi) {
            visitBreakPsi((BreakPsi) element);
        }
        else if (element instanceof ContinuePsi) {
            visitContinuePsi((ContinuePsi) element);
        }
        else if (element instanceof ThrowPsi) {
            visitThrowPsi((ThrowPsi) element);
        }
        else if (element instanceof ReturnPsi) {
            visitReturnPsi((ReturnPsi) element);
        }
        else if (element instanceof DirectivePsi) {
            visitDirectivePsi((DirectivePsi) element);
        }
        else if (element instanceof DefaultedTypePsi) {
            visitDefaultedTypePsi((DefaultedTypePsi) element);
        }
        else if (element instanceof SequencedTypePsi) {
            visitSequencedTypePsi((SequencedTypePsi) element);
        }
        else if (element instanceof InferredTypeArgumentsPsi) {
            visitInferredTypeArgumentsPsi((InferredTypeArgumentsPsi) element);
        }
        else if (element instanceof TypeArgumentListPsi) {
            visitTypeArgumentListPsi((TypeArgumentListPsi) element);
        }
        else if (element instanceof TypeArgumentsPsi) {
            visitTypeArgumentsPsi((TypeArgumentsPsi) element);
        }
        else if (element instanceof SyntheticVariablePsi) {
            visitSyntheticVariablePsi((SyntheticVariablePsi) element);
        }
        else if (element instanceof FunctionModifierPsi) {
            visitFunctionModifierPsi((FunctionModifierPsi) element);
        }
        else if (element instanceof ValueModifierPsi) {
            visitValueModifierPsi((ValueModifierPsi) element);
        }
        else if (element instanceof LocalModifierPsi) {
            visitLocalModifierPsi((LocalModifierPsi) element);
        }
        else if (element instanceof DynamicModifierPsi) {
            visitDynamicModifierPsi((DynamicModifierPsi) element);
        }
        else if (element instanceof PackageLiteralPsi) {
            visitPackageLiteralPsi((PackageLiteralPsi) element);
        }
        else if (element instanceof ModuleLiteralPsi) {
            visitModuleLiteralPsi((ModuleLiteralPsi) element);
        }
        else if (element instanceof FunctionLiteralPsi) {
            visitFunctionLiteralPsi((FunctionLiteralPsi) element);
        }
        else if (element instanceof ValueLiteralPsi) {
            visitValueLiteralPsi((ValueLiteralPsi) element);
        }
        else if (element instanceof TypeParameterLiteralPsi) {
            visitTypeParameterLiteralPsi((TypeParameterLiteralPsi) element);
        }
        else if (element instanceof AliasLiteralPsi) {
            visitAliasLiteralPsi((AliasLiteralPsi) element);
        }
        else if (element instanceof InterfaceLiteralPsi) {
            visitInterfaceLiteralPsi((InterfaceLiteralPsi) element);
        }
        else if (element instanceof ClassLiteralPsi) {
            visitClassLiteralPsi((ClassLiteralPsi) element);
        }
        else if (element instanceof MemberLiteralPsi) {
            visitMemberLiteralPsi((MemberLiteralPsi) element);
        }
        else if (element instanceof TypeLiteralPsi) {
            visitTypeLiteralPsi((TypeLiteralPsi) element);
        }
        else if (element instanceof MetaLiteralPsi) {
            visitMetaLiteralPsi((MetaLiteralPsi) element);
        }
        else if (element instanceof SuperTypePsi) {
            visitSuperTypePsi((SuperTypePsi) element);
        }
        else if (element instanceof QualifiedTypePsi) {
            visitQualifiedTypePsi((QualifiedTypePsi) element);
        }
        else if (element instanceof EntryTypePsi) {
            visitEntryTypePsi((EntryTypePsi) element);
        }
        else if (element instanceof FunctionTypePsi) {
            visitFunctionTypePsi((FunctionTypePsi) element);
        }
        else if (element instanceof TupleTypePsi) {
            visitTupleTypePsi((TupleTypePsi) element);
        }
        else if (element instanceof OptionalTypePsi) {
            visitOptionalTypePsi((OptionalTypePsi) element);
        }
        else if (element instanceof IterableTypePsi) {
            visitIterableTypePsi((IterableTypePsi) element);
        }
        else if (element instanceof SequenceTypePsi) {
            visitSequenceTypePsi((SequenceTypePsi) element);
        }
        else if (element instanceof IntersectionTypePsi) {
            visitIntersectionTypePsi((IntersectionTypePsi) element);
        }
        else if (element instanceof UnionTypePsi) {
            visitUnionTypePsi((UnionTypePsi) element);
        }
        else if (element instanceof BaseTypePsi) {
            visitBaseTypePsi((BaseTypePsi) element);
        }
        else if (element instanceof SimpleTypePsi) {
            visitSimpleTypePsi((SimpleTypePsi) element);
        }
        else if (element instanceof StaticTypePsi) {
            visitStaticTypePsi((StaticTypePsi) element);
        }
        else if (element instanceof TypePsi) {
            visitTypePsi((TypePsi) element);
        }
        else if (element instanceof InterfaceBodyPsi) {
            visitInterfaceBodyPsi((InterfaceBodyPsi) element);
        }
        else if (element instanceof ClassBodyPsi) {
            visitClassBodyPsi((ClassBodyPsi) element);
        }
        else if (element instanceof BlockPsi) {
            visitBlockPsi((BlockPsi) element);
        }
        else if (element instanceof BodyPsi) {
            visitBodyPsi((BodyPsi) element);
        }
        else if (element instanceof TypeVariancePsi) {
            visitTypeVariancePsi((TypeVariancePsi) element);
        }
        else if (element instanceof TypeParameterDeclarationPsi) {
            visitTypeParameterDeclarationPsi((TypeParameterDeclarationPsi) element);
        }
        else if (element instanceof TypeParameterListPsi) {
            visitTypeParameterListPsi((TypeParameterListPsi) element);
        }
        else if (element instanceof InitializerParameterPsi) {
            visitInitializerParameterPsi((InitializerParameterPsi) element);
        }
        else if (element instanceof FunctionalParameterDeclarationPsi) {
            visitFunctionalParameterDeclarationPsi((FunctionalParameterDeclarationPsi) element);
        }
        else if (element instanceof ValueParameterDeclarationPsi) {
            visitValueParameterDeclarationPsi((ValueParameterDeclarationPsi) element);
        }
        else if (element instanceof ParameterDeclarationPsi) {
            visitParameterDeclarationPsi((ParameterDeclarationPsi) element);
        }
        else if (element instanceof ParameterPsi) {
            visitParameterPsi((ParameterPsi) element);
        }
        else if (element instanceof ParameterListPsi) {
            visitParameterListPsi((ParameterListPsi) element);
        }
        else if (element instanceof ObjectDefinitionPsi) {
            visitObjectDefinitionPsi((ObjectDefinitionPsi) element);
        }
        else if (element instanceof VoidModifierPsi) {
            visitVoidModifierPsi((VoidModifierPsi) element);
        }
        else if (element instanceof MethodDeclarationPsi) {
            visitMethodDeclarationPsi((MethodDeclarationPsi) element);
        }
        else if (element instanceof MethodDefinitionPsi) {
            visitMethodDefinitionPsi((MethodDefinitionPsi) element);
        }
        else if (element instanceof AnyMethodPsi) {
            visitAnyMethodPsi((AnyMethodPsi) element);
        }
        else if (element instanceof AttributeSetterDefinitionPsi) {
            visitAttributeSetterDefinitionPsi((AttributeSetterDefinitionPsi) element);
        }
        else if (element instanceof AttributeGetterDefinitionPsi) {
            visitAttributeGetterDefinitionPsi((AttributeGetterDefinitionPsi) element);
        }
        else if (element instanceof AttributeDeclarationPsi) {
            visitAttributeDeclarationPsi((AttributeDeclarationPsi) element);
        }
        else if (element instanceof AnyAttributePsi) {
            visitAnyAttributePsi((AnyAttributePsi) element);
        }
        else if (element instanceof TypedDeclarationPsi) {
            visitTypedDeclarationPsi((TypedDeclarationPsi) element);
        }
        else if (element instanceof InterfaceDeclarationPsi) {
            visitInterfaceDeclarationPsi((InterfaceDeclarationPsi) element);
        }
        else if (element instanceof InterfaceDefinitionPsi) {
            visitInterfaceDefinitionPsi((InterfaceDefinitionPsi) element);
        }
        else if (element instanceof AnyInterfacePsi) {
            visitAnyInterfacePsi((AnyInterfacePsi) element);
        }
        else if (element instanceof ClassDeclarationPsi) {
            visitClassDeclarationPsi((ClassDeclarationPsi) element);
        }
        else if (element instanceof ClassDefinitionPsi) {
            visitClassDefinitionPsi((ClassDefinitionPsi) element);
        }
        else if (element instanceof AnyClassPsi) {
            visitAnyClassPsi((AnyClassPsi) element);
        }
        else if (element instanceof ClassSpecifierPsi) {
            visitClassSpecifierPsi((ClassSpecifierPsi) element);
        }
        else if (element instanceof DefaultTypeArgumentPsi) {
            visitDefaultTypeArgumentPsi((DefaultTypeArgumentPsi) element);
        }
        else if (element instanceof TypeSpecifierPsi) {
            visitTypeSpecifierPsi((TypeSpecifierPsi) element);
        }
        else if (element instanceof TypeConstraintPsi) {
            visitTypeConstraintPsi((TypeConstraintPsi) element);
        }
        else if (element instanceof TypeConstraintListPsi) {
            visitTypeConstraintListPsi((TypeConstraintListPsi) element);
        }
        else if (element instanceof ExtendedTypePsi) {
            visitExtendedTypePsi((ExtendedTypePsi) element);
        }
        else if (element instanceof CaseTypesPsi) {
            visitCaseTypesPsi((CaseTypesPsi) element);
        }
        else if (element instanceof AbstractedTypePsi) {
            visitAbstractedTypePsi((AbstractedTypePsi) element);
        }
        else if (element instanceof SatisfiedTypesPsi) {
            visitSatisfiedTypesPsi((SatisfiedTypesPsi) element);
        }
        else if (element instanceof TypeAliasDeclarationPsi) {
            visitTypeAliasDeclarationPsi((TypeAliasDeclarationPsi) element);
        }
        else if (element instanceof ClassOrInterfacePsi) {
            visitClassOrInterfacePsi((ClassOrInterfacePsi) element);
        }
        else if (element instanceof TypeDeclarationPsi) {
            visitTypeDeclarationPsi((TypeDeclarationPsi) element);
        }
        else if (element instanceof MissingDeclarationPsi) {
            visitMissingDeclarationPsi((MissingDeclarationPsi) element);
        }
        else if (element instanceof DeclarationPsi) {
            visitDeclarationPsi((DeclarationPsi) element);
        }
        else if (element instanceof ImportWildcardPsi) {
            visitImportWildcardPsi((ImportWildcardPsi) element);
        }
        else if (element instanceof AliasPsi) {
            visitAliasPsi((AliasPsi) element);
        }
        else if (element instanceof ImportTypePsi) {
            visitImportTypePsi((ImportTypePsi) element);
        }
        else if (element instanceof ImportMemberPsi) {
            visitImportMemberPsi((ImportMemberPsi) element);
        }
        else if (element instanceof ImportMemberOrTypePsi) {
            visitImportMemberOrTypePsi((ImportMemberOrTypePsi) element);
        }
        else if (element instanceof ImportMemberOrTypeListPsi) {
            visitImportMemberOrTypeListPsi((ImportMemberOrTypeListPsi) element);
        }
        else if (element instanceof ImportPathPsi) {
            visitImportPathPsi((ImportPathPsi) element);
        }
        else if (element instanceof ImportPsi) {
            visitImportPsi((ImportPsi) element);
        }
        else if (element instanceof ImportListPsi) {
            visitImportListPsi((ImportListPsi) element);
        }
        else if (element instanceof ImportModulePsi) {
            visitImportModulePsi((ImportModulePsi) element);
        }
        else if (element instanceof ImportModuleListPsi) {
            visitImportModuleListPsi((ImportModuleListPsi) element);
        }
        else if (element instanceof PackageDescriptorPsi) {
            visitPackageDescriptorPsi((PackageDescriptorPsi) element);
        }
        else if (element instanceof ModuleDescriptorPsi) {
            visitModuleDescriptorPsi((ModuleDescriptorPsi) element);
        }
        else if (element instanceof CompilationUnitPsi) {
            visitCompilationUnitPsi((CompilationUnitPsi) element);
        }
    }
    public void visitIfComprehensionClausePsi(@NotNull IfComprehensionClausePsi element) {}
    public void visitForComprehensionClausePsi(@NotNull ForComprehensionClausePsi element) {}
    public void visitExpressionComprehensionClausePsi(@NotNull ExpressionComprehensionClausePsi element) {}
    public void visitComprehensionClausePsi(@NotNull ComprehensionClausePsi element) {}
    public void visitComprehensionPsi(@NotNull ComprehensionPsi element) {}
    public void visitIdentifierPsi(@NotNull IdentifierPsi element) {}
    public void visitAnnotationListPsi(@NotNull AnnotationListPsi element) {}
    public void visitAnonymousAnnotationPsi(@NotNull AnonymousAnnotationPsi element) {}
    public void visitAnnotationPsi(@NotNull AnnotationPsi element) {}
    public void visitStringTemplatePsi(@NotNull StringTemplatePsi element) {}
    public void visitDynamicPsi(@NotNull DynamicPsi element) {}
    public void visitTuplePsi(@NotNull TuplePsi element) {}
    public void visitSequenceEnumerationPsi(@NotNull SequenceEnumerationPsi element) {}
    public void visitSuperPsi(@NotNull SuperPsi element) {}
    public void visitThisPsi(@NotNull ThisPsi element) {}
    public void visitSelfExpressionPsi(@NotNull SelfExpressionPsi element) {}
    public void visitQuotedLiteralPsi(@NotNull QuotedLiteralPsi element) {}
    public void visitStringLiteralPsi(@NotNull StringLiteralPsi element) {}
    public void visitCharLiteralPsi(@NotNull CharLiteralPsi element) {}
    public void visitFloatLiteralPsi(@NotNull FloatLiteralPsi element) {}
    public void visitNaturalLiteralPsi(@NotNull NaturalLiteralPsi element) {}
    public void visitLiteralPsi(@NotNull LiteralPsi element) {}
    public void visitAtomPsi(@NotNull AtomPsi element) {}
    public void visitInitializerExpressionPsi(@NotNull InitializerExpressionPsi element) {}
    public void visitLazySpecifierExpressionPsi(@NotNull LazySpecifierExpressionPsi element) {}
    public void visitSpecifierExpressionPsi(@NotNull SpecifierExpressionPsi element) {}
    public void visitSpecifierOrInitializerExpressionPsi(@NotNull SpecifierOrInitializerExpressionPsi element) {}
    public void visitObjectArgumentPsi(@NotNull ObjectArgumentPsi element) {}
    public void visitAttributeArgumentPsi(@NotNull AttributeArgumentPsi element) {}
    public void visitMethodArgumentPsi(@NotNull MethodArgumentPsi element) {}
    public void visitTypedArgumentPsi(@NotNull TypedArgumentPsi element) {}
    public void visitSpecifiedArgumentPsi(@NotNull SpecifiedArgumentPsi element) {}
    public void visitNamedArgumentPsi(@NotNull NamedArgumentPsi element) {}
    public void visitFunctionArgumentPsi(@NotNull FunctionArgumentPsi element) {}
    public void visitSpreadArgumentPsi(@NotNull SpreadArgumentPsi element) {}
    public void visitListedArgumentPsi(@NotNull ListedArgumentPsi element) {}
    public void visitPositionalArgumentPsi(@NotNull PositionalArgumentPsi element) {}
    public void visitPositionalArgumentListPsi(@NotNull PositionalArgumentListPsi element) {}
    public void visitSequencedArgumentPsi(@NotNull SequencedArgumentPsi element) {}
    public void visitNamedArgumentListPsi(@NotNull NamedArgumentListPsi element) {}
    public void visitArgumentListPsi(@NotNull ArgumentListPsi element) {}
    public void visitPackagePsi(@NotNull PackagePsi element) {}
    public void visitOuterPsi(@NotNull OuterPsi element) {}
    public void visitElementRangePsi(@NotNull ElementRangePsi element) {}
    public void visitElementPsi(@NotNull ElementPsi element) {}
    public void visitElementOrRangePsi(@NotNull ElementOrRangePsi element) {}
    public void visitIndexExpressionPsi(@NotNull IndexExpressionPsi element) {}
    public void visitSpreadOpPsi(@NotNull SpreadOpPsi element) {}
    public void visitSafeMemberOpPsi(@NotNull SafeMemberOpPsi element) {}
    public void visitMemberOpPsi(@NotNull MemberOpPsi element) {}
    public void visitMemberOperatorPsi(@NotNull MemberOperatorPsi element) {}
    public void visitQualifiedTypeExpressionPsi(@NotNull QualifiedTypeExpressionPsi element) {}
    public void visitQualifiedMemberExpressionPsi(@NotNull QualifiedMemberExpressionPsi element) {}
    public void visitQualifiedMemberOrTypeExpressionPsi(@NotNull QualifiedMemberOrTypeExpressionPsi element) {}
    public void visitBaseTypeExpressionPsi(@NotNull BaseTypeExpressionPsi element) {}
    public void visitBaseMemberExpressionPsi(@NotNull BaseMemberExpressionPsi element) {}
    public void visitBaseMemberOrTypeExpressionPsi(@NotNull BaseMemberOrTypeExpressionPsi element) {}
    public void visitStaticMemberOrTypeExpressionPsi(@NotNull StaticMemberOrTypeExpressionPsi element) {}
    public void visitExtendedTypeExpressionPsi(@NotNull ExtendedTypeExpressionPsi element) {}
    public void visitMemberOrTypeExpressionPsi(@NotNull MemberOrTypeExpressionPsi element) {}
    public void visitParameterizedExpressionPsi(@NotNull ParameterizedExpressionPsi element) {}
    public void visitInvocationExpressionPsi(@NotNull InvocationExpressionPsi element) {}
    public void visitPostfixExpressionPsi(@NotNull PostfixExpressionPsi element) {}
    public void visitPrimaryPsi(@NotNull PrimaryPsi element) {}
    public void visitExpressionPsi(@NotNull ExpressionPsi element) {}
    public void visitExpressionListPsi(@NotNull ExpressionListPsi element) {}
    public void visitPostfixDecrementOpPsi(@NotNull PostfixDecrementOpPsi element) {}
    public void visitPostfixIncrementOpPsi(@NotNull PostfixIncrementOpPsi element) {}
    public void visitPostfixOperatorExpressionPsi(@NotNull PostfixOperatorExpressionPsi element) {}
    public void visitDecrementOpPsi(@NotNull DecrementOpPsi element) {}
    public void visitIncrementOpPsi(@NotNull IncrementOpPsi element) {}
    public void visitPrefixOperatorExpressionPsi(@NotNull PrefixOperatorExpressionPsi element) {}
    public void visitOfOpPsi(@NotNull OfOpPsi element) {}
    public void visitExtendsPsi(@NotNull ExtendsPsi element) {}
    public void visitSatisfiesPsi(@NotNull SatisfiesPsi element) {}
    public void visitIsOpPsi(@NotNull IsOpPsi element) {}
    public void visitTypeOperatorExpressionPsi(@NotNull TypeOperatorExpressionPsi element) {}
    public void visitPositiveOpPsi(@NotNull PositiveOpPsi element) {}
    public void visitNegativeOpPsi(@NotNull NegativeOpPsi element) {}
    public void visitNonemptyPsi(@NotNull NonemptyPsi element) {}
    public void visitExistsPsi(@NotNull ExistsPsi element) {}
    public void visitNotOpPsi(@NotNull NotOpPsi element) {}
    public void visitUnaryOperatorExpressionPsi(@NotNull UnaryOperatorExpressionPsi element) {}
    public void visitInOpPsi(@NotNull InOpPsi element) {}
    public void visitCompareOpPsi(@NotNull CompareOpPsi element) {}
    public void visitSegmentOpPsi(@NotNull SegmentOpPsi element) {}
    public void visitRangeOpPsi(@NotNull RangeOpPsi element) {}
    public void visitEntryOpPsi(@NotNull EntryOpPsi element) {}
    public void visitIdenticalOpPsi(@NotNull IdenticalOpPsi element) {}
    public void visitThenOpPsi(@NotNull ThenOpPsi element) {}
    public void visitDefaultOpPsi(@NotNull DefaultOpPsi element) {}
    public void visitWithinOpPsi(@NotNull WithinOpPsi element) {}
    public void visitClosedBoundPsi(@NotNull ClosedBoundPsi element) {}
    public void visitOpenBoundPsi(@NotNull OpenBoundPsi element) {}
    public void visitBoundPsi(@NotNull BoundPsi element) {}
    public void visitScaleOpPsi(@NotNull ScaleOpPsi element) {}
    public void visitSmallAsOpPsi(@NotNull SmallAsOpPsi element) {}
    public void visitLargeAsOpPsi(@NotNull LargeAsOpPsi element) {}
    public void visitSmallerOpPsi(@NotNull SmallerOpPsi element) {}
    public void visitLargerOpPsi(@NotNull LargerOpPsi element) {}
    public void visitComparisonOpPsi(@NotNull ComparisonOpPsi element) {}
    public void visitNotEqualOpPsi(@NotNull NotEqualOpPsi element) {}
    public void visitEqualOpPsi(@NotNull EqualOpPsi element) {}
    public void visitEqualityOpPsi(@NotNull EqualityOpPsi element) {}
    public void visitComplementOpPsi(@NotNull ComplementOpPsi element) {}
    public void visitXorOpPsi(@NotNull XorOpPsi element) {}
    public void visitUnionOpPsi(@NotNull UnionOpPsi element) {}
    public void visitIntersectionOpPsi(@NotNull IntersectionOpPsi element) {}
    public void visitBitwiseOpPsi(@NotNull BitwiseOpPsi element) {}
    public void visitOrOpPsi(@NotNull OrOpPsi element) {}
    public void visitAndOpPsi(@NotNull AndOpPsi element) {}
    public void visitLogicalOpPsi(@NotNull LogicalOpPsi element) {}
    public void visitOrAssignOpPsi(@NotNull OrAssignOpPsi element) {}
    public void visitAndAssignOpPsi(@NotNull AndAssignOpPsi element) {}
    public void visitLogicalAssignmentOpPsi(@NotNull LogicalAssignmentOpPsi element) {}
    public void visitComplementAssignOpPsi(@NotNull ComplementAssignOpPsi element) {}
    public void visitXorAssignOpPsi(@NotNull XorAssignOpPsi element) {}
    public void visitUnionAssignOpPsi(@NotNull UnionAssignOpPsi element) {}
    public void visitIntersectAssignOpPsi(@NotNull IntersectAssignOpPsi element) {}
    public void visitBitwiseAssignmentOpPsi(@NotNull BitwiseAssignmentOpPsi element) {}
    public void visitRemainderAssignOpPsi(@NotNull RemainderAssignOpPsi element) {}
    public void visitDivideAssignOpPsi(@NotNull DivideAssignOpPsi element) {}
    public void visitMultiplyAssignOpPsi(@NotNull MultiplyAssignOpPsi element) {}
    public void visitSubtractAssignOpPsi(@NotNull SubtractAssignOpPsi element) {}
    public void visitAddAssignOpPsi(@NotNull AddAssignOpPsi element) {}
    public void visitArithmeticAssignmentOpPsi(@NotNull ArithmeticAssignmentOpPsi element) {}
    public void visitAssignOpPsi(@NotNull AssignOpPsi element) {}
    public void visitAssignmentOpPsi(@NotNull AssignmentOpPsi element) {}
    public void visitRemainderOpPsi(@NotNull RemainderOpPsi element) {}
    public void visitPowerOpPsi(@NotNull PowerOpPsi element) {}
    public void visitQuotientOpPsi(@NotNull QuotientOpPsi element) {}
    public void visitProductOpPsi(@NotNull ProductOpPsi element) {}
    public void visitDifferenceOpPsi(@NotNull DifferenceOpPsi element) {}
    public void visitSumOpPsi(@NotNull SumOpPsi element) {}
    public void visitArithmeticOpPsi(@NotNull ArithmeticOpPsi element) {}
    public void visitBinaryOperatorExpressionPsi(@NotNull BinaryOperatorExpressionPsi element) {}
    public void visitOperatorExpressionPsi(@NotNull OperatorExpressionPsi element) {}
    public void visitTermPsi(@NotNull TermPsi element) {}
    public void visitVariablePsi(@NotNull VariablePsi element) {}
    public void visitSatisfiesConditionPsi(@NotNull SatisfiesConditionPsi element) {}
    public void visitIsConditionPsi(@NotNull IsConditionPsi element) {}
    public void visitNonemptyConditionPsi(@NotNull NonemptyConditionPsi element) {}
    public void visitExistsConditionPsi(@NotNull ExistsConditionPsi element) {}
    public void visitExistsOrNonemptyConditionPsi(@NotNull ExistsOrNonemptyConditionPsi element) {}
    public void visitBooleanConditionPsi(@NotNull BooleanConditionPsi element) {}
    public void visitConditionPsi(@NotNull ConditionPsi element) {}
    public void visitConditionListPsi(@NotNull ConditionListPsi element) {}
    public void visitWhileClausePsi(@NotNull WhileClausePsi element) {}
    public void visitWhileStatementPsi(@NotNull WhileStatementPsi element) {}
    public void visitKeyValueIteratorPsi(@NotNull KeyValueIteratorPsi element) {}
    public void visitValueIteratorPsi(@NotNull ValueIteratorPsi element) {}
    public void visitForIteratorPsi(@NotNull ForIteratorPsi element) {}
    public void visitForClausePsi(@NotNull ForClausePsi element) {}
    public void visitForStatementPsi(@NotNull ForStatementPsi element) {}
    public void visitCatchVariablePsi(@NotNull CatchVariablePsi element) {}
    public void visitResourcePsi(@NotNull ResourcePsi element) {}
    public void visitResourceListPsi(@NotNull ResourceListPsi element) {}
    public void visitFinallyClausePsi(@NotNull FinallyClausePsi element) {}
    public void visitCatchClausePsi(@NotNull CatchClausePsi element) {}
    public void visitTryClausePsi(@NotNull TryClausePsi element) {}
    public void visitTryCatchStatementPsi(@NotNull TryCatchStatementPsi element) {}
    public void visitSatisfiesCasePsi(@NotNull SatisfiesCasePsi element) {}
    public void visitIsCasePsi(@NotNull IsCasePsi element) {}
    public void visitMatchCasePsi(@NotNull MatchCasePsi element) {}
    public void visitCaseItemPsi(@NotNull CaseItemPsi element) {}
    public void visitCaseClausePsi(@NotNull CaseClausePsi element) {}
    public void visitSwitchCaseListPsi(@NotNull SwitchCaseListPsi element) {}
    public void visitSwitchClausePsi(@NotNull SwitchClausePsi element) {}
    public void visitSwitchStatementPsi(@NotNull SwitchStatementPsi element) {}
    public void visitElseClausePsi(@NotNull ElseClausePsi element) {}
    public void visitIfClausePsi(@NotNull IfClausePsi element) {}
    public void visitIfStatementPsi(@NotNull IfStatementPsi element) {}
    public void visitDynamicClausePsi(@NotNull DynamicClausePsi element) {}
    public void visitDynamicStatementPsi(@NotNull DynamicStatementPsi element) {}
    public void visitControlClausePsi(@NotNull ControlClausePsi element) {}
    public void visitControlStatementPsi(@NotNull ControlStatementPsi element) {}
    public void visitExpressionStatementPsi(@NotNull ExpressionStatementPsi element) {}
    public void visitSpecifierStatementPsi(@NotNull SpecifierStatementPsi element) {}
    public void visitAssertionPsi(@NotNull AssertionPsi element) {}
    public void visitExecutableStatementPsi(@NotNull ExecutableStatementPsi element) {}
    public void visitCompilerAnnotationPsi(@NotNull CompilerAnnotationPsi element) {}
    public void visitStatementPsi(@NotNull StatementPsi element) {}
    public void visitStatementOrArgumentPsi(@NotNull StatementOrArgumentPsi element) {}
    public void visitBreakPsi(@NotNull BreakPsi element) {}
    public void visitContinuePsi(@NotNull ContinuePsi element) {}
    public void visitThrowPsi(@NotNull ThrowPsi element) {}
    public void visitReturnPsi(@NotNull ReturnPsi element) {}
    public void visitDirectivePsi(@NotNull DirectivePsi element) {}
    public void visitDefaultedTypePsi(@NotNull DefaultedTypePsi element) {}
    public void visitSequencedTypePsi(@NotNull SequencedTypePsi element) {}
    public void visitInferredTypeArgumentsPsi(@NotNull InferredTypeArgumentsPsi element) {}
    public void visitTypeArgumentListPsi(@NotNull TypeArgumentListPsi element) {}
    public void visitTypeArgumentsPsi(@NotNull TypeArgumentsPsi element) {}
    public void visitSyntheticVariablePsi(@NotNull SyntheticVariablePsi element) {}
    public void visitFunctionModifierPsi(@NotNull FunctionModifierPsi element) {}
    public void visitValueModifierPsi(@NotNull ValueModifierPsi element) {}
    public void visitLocalModifierPsi(@NotNull LocalModifierPsi element) {}
    public void visitDynamicModifierPsi(@NotNull DynamicModifierPsi element) {}
    public void visitPackageLiteralPsi(@NotNull PackageLiteralPsi element) {}
    public void visitModuleLiteralPsi(@NotNull ModuleLiteralPsi element) {}
    public void visitFunctionLiteralPsi(@NotNull FunctionLiteralPsi element) {}
    public void visitValueLiteralPsi(@NotNull ValueLiteralPsi element) {}
    public void visitTypeParameterLiteralPsi(@NotNull TypeParameterLiteralPsi element) {}
    public void visitAliasLiteralPsi(@NotNull AliasLiteralPsi element) {}
    public void visitInterfaceLiteralPsi(@NotNull InterfaceLiteralPsi element) {}
    public void visitClassLiteralPsi(@NotNull ClassLiteralPsi element) {}
    public void visitMemberLiteralPsi(@NotNull MemberLiteralPsi element) {}
    public void visitTypeLiteralPsi(@NotNull TypeLiteralPsi element) {}
    public void visitMetaLiteralPsi(@NotNull MetaLiteralPsi element) {}
    public void visitSuperTypePsi(@NotNull SuperTypePsi element) {}
    public void visitQualifiedTypePsi(@NotNull QualifiedTypePsi element) {}
    public void visitEntryTypePsi(@NotNull EntryTypePsi element) {}
    public void visitFunctionTypePsi(@NotNull FunctionTypePsi element) {}
    public void visitTupleTypePsi(@NotNull TupleTypePsi element) {}
    public void visitOptionalTypePsi(@NotNull OptionalTypePsi element) {}
    public void visitIterableTypePsi(@NotNull IterableTypePsi element) {}
    public void visitSequenceTypePsi(@NotNull SequenceTypePsi element) {}
    public void visitIntersectionTypePsi(@NotNull IntersectionTypePsi element) {}
    public void visitUnionTypePsi(@NotNull UnionTypePsi element) {}
    public void visitBaseTypePsi(@NotNull BaseTypePsi element) {}
    public void visitSimpleTypePsi(@NotNull SimpleTypePsi element) {}
    public void visitStaticTypePsi(@NotNull StaticTypePsi element) {}
    public void visitTypePsi(@NotNull TypePsi element) {}
    public void visitInterfaceBodyPsi(@NotNull InterfaceBodyPsi element) {}
    public void visitClassBodyPsi(@NotNull ClassBodyPsi element) {}
    public void visitBlockPsi(@NotNull BlockPsi element) {}
    public void visitBodyPsi(@NotNull BodyPsi element) {}
    public void visitTypeVariancePsi(@NotNull TypeVariancePsi element) {}
    public void visitTypeParameterDeclarationPsi(@NotNull TypeParameterDeclarationPsi element) {}
    public void visitTypeParameterListPsi(@NotNull TypeParameterListPsi element) {}
    public void visitInitializerParameterPsi(@NotNull InitializerParameterPsi element) {}
    public void visitFunctionalParameterDeclarationPsi(@NotNull FunctionalParameterDeclarationPsi element) {}
    public void visitValueParameterDeclarationPsi(@NotNull ValueParameterDeclarationPsi element) {}
    public void visitParameterDeclarationPsi(@NotNull ParameterDeclarationPsi element) {}
    public void visitParameterPsi(@NotNull ParameterPsi element) {}
    public void visitParameterListPsi(@NotNull ParameterListPsi element) {}
    public void visitObjectDefinitionPsi(@NotNull ObjectDefinitionPsi element) {}
    public void visitVoidModifierPsi(@NotNull VoidModifierPsi element) {}
    public void visitMethodDeclarationPsi(@NotNull MethodDeclarationPsi element) {}
    public void visitMethodDefinitionPsi(@NotNull MethodDefinitionPsi element) {}
    public void visitAnyMethodPsi(@NotNull AnyMethodPsi element) {}
    public void visitAttributeSetterDefinitionPsi(@NotNull AttributeSetterDefinitionPsi element) {}
    public void visitAttributeGetterDefinitionPsi(@NotNull AttributeGetterDefinitionPsi element) {}
    public void visitAttributeDeclarationPsi(@NotNull AttributeDeclarationPsi element) {}
    public void visitAnyAttributePsi(@NotNull AnyAttributePsi element) {}
    public void visitTypedDeclarationPsi(@NotNull TypedDeclarationPsi element) {}
    public void visitInterfaceDeclarationPsi(@NotNull InterfaceDeclarationPsi element) {}
    public void visitInterfaceDefinitionPsi(@NotNull InterfaceDefinitionPsi element) {}
    public void visitAnyInterfacePsi(@NotNull AnyInterfacePsi element) {}
    public void visitClassDeclarationPsi(@NotNull ClassDeclarationPsi element) {}
    public void visitClassDefinitionPsi(@NotNull ClassDefinitionPsi element) {}
    public void visitAnyClassPsi(@NotNull AnyClassPsi element) {}
    public void visitClassSpecifierPsi(@NotNull ClassSpecifierPsi element) {}
    public void visitDefaultTypeArgumentPsi(@NotNull DefaultTypeArgumentPsi element) {}
    public void visitTypeSpecifierPsi(@NotNull TypeSpecifierPsi element) {}
    public void visitTypeConstraintPsi(@NotNull TypeConstraintPsi element) {}
    public void visitTypeConstraintListPsi(@NotNull TypeConstraintListPsi element) {}
    public void visitExtendedTypePsi(@NotNull ExtendedTypePsi element) {}
    public void visitCaseTypesPsi(@NotNull CaseTypesPsi element) {}
    public void visitAbstractedTypePsi(@NotNull AbstractedTypePsi element) {}
    public void visitSatisfiedTypesPsi(@NotNull SatisfiedTypesPsi element) {}
    public void visitTypeAliasDeclarationPsi(@NotNull TypeAliasDeclarationPsi element) {}
    public void visitClassOrInterfacePsi(@NotNull ClassOrInterfacePsi element) {}
    public void visitTypeDeclarationPsi(@NotNull TypeDeclarationPsi element) {}
    public void visitMissingDeclarationPsi(@NotNull MissingDeclarationPsi element) {}
    public void visitDeclarationPsi(@NotNull DeclarationPsi element) {}
    public void visitImportWildcardPsi(@NotNull ImportWildcardPsi element) {}
    public void visitAliasPsi(@NotNull AliasPsi element) {}
    public void visitImportTypePsi(@NotNull ImportTypePsi element) {}
    public void visitImportMemberPsi(@NotNull ImportMemberPsi element) {}
    public void visitImportMemberOrTypePsi(@NotNull ImportMemberOrTypePsi element) {}
    public void visitImportMemberOrTypeListPsi(@NotNull ImportMemberOrTypeListPsi element) {}
    public void visitImportPathPsi(@NotNull ImportPathPsi element) {}
    public void visitImportPsi(@NotNull ImportPsi element) {}
    public void visitImportListPsi(@NotNull ImportListPsi element) {}
    public void visitImportModulePsi(@NotNull ImportModulePsi element) {}
    public void visitImportModuleListPsi(@NotNull ImportModuleListPsi element) {}
    public void visitPackageDescriptorPsi(@NotNull PackageDescriptorPsi element) {}
    public void visitModuleDescriptorPsi(@NotNull ModuleDescriptorPsi element) {}
    public void visitCompilationUnitPsi(@NotNull CompilationUnitPsi element) {}
}
