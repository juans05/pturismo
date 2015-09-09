<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<style>
.detailHeader {
	height: 30px;
	border: 1px solid #C3D3DD;
	/*background-color: #0E2C50;*/
	border-radius: 3px;
	overflow: hidden;
	line-height: 30px;
}

.detailHeaderLeft {
	float: left;
	margin-left: 10px;
}

.detailHeaderRight {
	float: right;
	font-size: 0px;
}

.h2v1 {
	text-transform: uppercase;
	line-height: 0px;
	font-size: 13px;
	/*color: #CFF;*/
	display: inline-block;
	font-weight: bold;
}
</style>
<div class="tab-pane active fade in" id="more-detail">
	<div class="tab-inner">
		<div class="detailHeader">

			<div class="detailHeaderLeft">
				<h2 class="h2v1">Detalles</h2>
			</div>
			<div class="detailHeaderRight">
				<span id="btnToEditCustOverview" style=""
					class="btn eventCustOverview custom-2"><span
					class="editIcon"></span>Editar</span>
			</div>

		</div>
		<br>
		<div class="span12" style="margin-left: 0px;">
			<div class="span6 sumaryBodyFather">
				<div class="span3 summaryBodySpan">
					<span class="labelv2"> edad</span>
				</div>
				<div class="span3">
					<span class="labelResultado"> 23</span>
				</div>
			</div>
			<div class="span6 sumaryBodyFather">
				<div class="span3 summaryBodySpan">
					<span class="labelv2"> ciudad</span>
				</div>
				<div class="span3">
					<span class="labelResultado"> Lima</span>
				</div>
			</div>
		</div>
		<br></br>
	</div>
</div>
<div class="tab-pane fade in" id="guide">
	<div class="tab-inner">
		<img class="float-left-img" src="assets/img/tours/tab.jpg" alt="" />

		<p>Duis quis dolor ipsum. Donec vehicula commodo nulla vel
			aliquam. Pellentesque vitae justo varius, pretium neque accumsan,
			aliquam nisl. Donec sagittis quam nulla, sed porta risus luctus ut.</p>
		<p>Aenean pellentesque eget velit vitae tincidunt. Suspendisse et
			dui neque. Sed eu ante vel dui iaculis tempus fringilla eu erat.</p>
		<p>Duis quis dolor ipsum. Donec vehicula commodo nulla vel
			aliquam. Pellentesque vitae justo varius, pretium neque accumsan,
			aliquam nisl. Donec sagittis quam nulla, sed porta risus luctus ut.
			Aenean pellentesque eget velit vitae tincidunt. Suspendisse et dui
			neque. Sed eu ante vel dui iaculis tempus fringilla eu erat.</p>
	</div>
</div>
<div class="tab-pane fade in" id="Comments">
	<div class="tab-inner">
		<img class="float-left-img" src="assets/img/tours/tab.jpg" alt="" />
		<p>Duis quis dolor ipsum. Donec vehicula commodo nulla vel
			aliquam. Pellentesque vitae justo varius, pretium neque accumsan,
			aliquam nisl. Donec sagittis quam nulla, sed porta risus luctus ut.</p>
		<p>Aenean pellentesque eget velit vitae tincidunt. Suspendisse et
			dui neque. Sed eu ante vel dui iaculis tempus fringilla eu erat.</p>
		<p>Duis quis dolor ipsum. Donec vehicula commodo nulla vel
			aliquam. Pellentesque vitae justo varius, pretium neque accumsan,
			aliquam nisl. Donec sagittis quam nulla, sed porta risus luctus ut.
			Aenean pellentesque eget velit vitae tincidunt. Suspendisse et dui
			neque. Sed eu ante vel dui iaculis tempus fringilla eu erat.</p>
	</div>
</div>