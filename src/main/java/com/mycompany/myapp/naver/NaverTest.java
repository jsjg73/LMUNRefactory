package com.mycompany.myapp.naver;

import java.util.List;

import org.json.simple.parser.JSONParser;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mycompany.myapp.model.Place;
import com.mycompany.myapp.service.MapServiceImpl;

public class NaverTest {

	public static void main(String[] args) {
		MapServiceImpl ms = new MapServiceImpl();
		System.out.println(ms.keywordSearch("명동역"));
		//System.out.println(ms.keywordSearch("국민대학교"));
		
		//x=126.986400086711, y=37.5609634671841 명동역
//		x=126.865572139231, y=37.5507280806214, 등촌역
//		x=126.996969239236, y=37.6107638961532, 국민대
//		String start ="126.865572139231,37.5507280806214";
//		String goal = "126.996969239236,37.6107638961532";
//		PublicDataService pd = new PublicDataService();
//		List<Place> list = new JsonParsing().getPath(pd.getPath(start, goal));
		// "path":[[126.8656054,37.5507657],[126.8650787,37.5510576],[126.8650492,37.5510745],[126.8647183,37.5512377],[126.8646104,37.5512894],[126.8645490,37.5513197],[126.8644864,37.5513491],[126.8644046,37.5513866],[126.8641046,37.5515246],[126.8640693,37.5515407],[126.8640703,37.5512982],[126.8640918,37.5511577],[126.8641062,37.5510677],[126.8641127,37.5509695],[126.8641179,37.5508857],[126.8641129,37.5508135],[126.8640657,37.5506366],[126.8640624,37.5506249],[126.8640525,37.5505942],[126.8639622,37.5502908],[126.8638034,37.5503242],[126.8633804,37.5504139],[126.8632114,37.5504499],[126.8628996,37.5505104],[126.8625741,37.5505745],[126.8627197,37.5510268],[126.8627748,37.5511993],[126.8628544,37.5515648],[126.8629330,37.5517662],[126.8629663,37.5518529],[126.8635526,37.5516001],[126.8636276,37.5515680],[126.8639810,37.5514077],[126.8640083,37.5513952],[126.8640594,37.5513721],[126.8644027,37.5512144],[126.8645107,37.5511591],[126.8645755,37.5511261],[126.8649166,37.5509585],[126.8649586,37.5509380],[126.8650098,37.5509103],[126.8650997,37.5508576],[126.8658801,37.5504084],[126.8665183,37.5500405],[126.8668392,37.5498547],[126.8673545,37.5495564],[126.8674000,37.5495296],[126.8676310,37.5493957],[126.8678369,37.5492742],[126.8679051,37.5492376],[126.8679643,37.5492064],[126.8680052,37.5491841],[126.8683373,37.5490083],[126.8687115,37.5487994],[126.8689777,37.5486358],[126.8691416,37.5485358],[126.8700827,37.5479594],[126.8701510,37.5479174],[126.8702784,37.5478397],[126.8704990,37.5477192],[126.8705536,37.5476915],[126.8706821,37.5476255],[126.8708775,37.5475382],[126.8710389,37.5474661],[126.8713228,37.5473576],[126.8716067,37.5472546],[126.8718292,37.5471791],[126.8722049,37.5470649],[126.8723750,37.5470252],[126.8725156,37.5469980],[126.8728024,37.5469545],[126.8731447,37.5468977],[126.8735730,37.5468558],[126.8737157,37.5468467],[126.8739285,37.5468487],[126.8747094,37.5468772],[126.8749991,37.5468877],[126.8750376,37.5468879],[126.8753216,37.5469011],[126.8759145,37.5469340],[126.8763128,37.5469532],[126.8765776,37.5469664],[126.8769397,37.5469854],[126.8773923,37.5470085],[126.8776320,37.5470476],[126.8777383,37.5470644],[126.8778502,37.5470812],[126.8778785,37.5470850],[126.8782866,37.5471493],[126.8798242,37.5475243],[126.8798999,37.5475409],[126.8802614,37.5476320],[126.8805427,37.5477020],[126.8811358,37.5478502],[126.8813991,37.5479165],[126.8815868,37.5479409],[126.8817620,37.5479662],[126.8820371,37.5479658],[126.8823871,37.5479496],[126.8826739,37.5478997],[126.8829872,37.5477995],[126.8836808,37.5474309],[126.8839058,37.5473212],[126.8860791,37.5462464],[126.8863371,37.5461242],[126.8865258,37.5460261],[126.8870908,37.5457334],[126.8872249,37.5456665],[126.8873307,37.5456102],[126.8873989,37.5455745],[126.8875671,37.5454934],[126.8876239,37.5454666],[126.8880618,37.5453499],[126.8883498,37.5452991],[126.8885497,37.5453498],[126.8886499,37.5454161],[126.8888742,37.5456741],[126.8889093,37.5458176],[126.8889246,37.5458826],[126.8889239,37.5461079],[126.8888525,37.5463915],[126.8886677,37.5468403],[126.8886146,37.5469743],[126.8885841,37.5470976],[126.8885765,37.5471968],[126.8885929,37.5472735],[126.8886581,37.5474640],[126.8892119,37.5482708],[126.8894308,37.5486388],[126.8896165,37.5490463],[126.8898323,37.5499271],[126.8905182,37.5510609],[126.8913315,37.5523973],[126.8930006,37.5551424],[126.8932230,37.5555095],[126.8937135,37.5563061],[126.8937437,37.5563603],[126.8939144,37.5566713],[126.8940114,37.5568493],[126.8940550,37.5569199],[126.8940673,37.5569407],[126.8940751,37.5569524],[126.8941108,37.5570157],[126.8941309,37.5570546],[126.8944972,37.5576793],[126.8945878,37.5578158],[126.8949118,37.5583511],[126.8949498,37.5584162],[126.8950872,37.5586494],[126.8951990,37.5588267],[126.8952068,37.5588384],[126.8952157,37.5588529],[126.8953823,37.5591205],[126.8954996,37.5593077],[126.8955310,37.5593520],[126.8956989,37.5595909],[126.8957292,37.5596262],[126.8958290,37.5597448],[126.8958615,37.5597828],[126.8959557,37.5598995],[126.8962685,37.5601355],[126.8963215,37.5601691],[126.8966270,37.5603275],[126.8966733,37.5603458],[126.8985863,37.5611091],[126.8986597,37.5611383],[126.9003176,37.5618092],[126.9010625,37.5621023],[126.9022298,37.5625391],[126.9022942,37.5625547],[126.9034062,37.5628361],[126.9036615,37.5629095],[126.9037044,37.5629242],[126.9037880,37.5629498],[126.9038139,37.5629581],[126.9038535,37.5629700],[126.9041313,37.5630606],[126.9043832,37.5631385],[126.9055013,37.5634930],[126.9059306,37.5636240],[126.9060684,37.5636662],[126.9071675,37.5639971],[126.9072669,37.5640273],[126.9078384,37.5642024],[126.9083729,37.5643457],[126.9087243,37.5644403],[126.9091514,37.5645542],[126.9092452,37.5645799],[126.9100315,37.5647956],[126.9108304,37.5650159],[126.9111072,37.5650912],[126.9112789,37.5651389],[126.9113908,37.5651692],[126.9115704,37.5652197],[126.9117625,37.5652748],[126.9120393,37.5653545],[126.9121116,37.5653747],[126.9133327,37.5657513],[126.9140093,37.5659574],[126.9141189,37.5659931],[126.9146375,37.5661408],[126.9152492,37.5663998],[126.9164135,37.5670888],[126.9167258,37.5672553],[126.9169120,37.5673409],[126.9171943,37.5674496],[126.9174294,37.5674985],[126.9176647,37.5675285],[126.9178492,37.5675394],[126.9180213,37.5675348],[126.9183864,37.5674807],[126.9185056,37.5674425],[126.9196249,37.5670830],[126.9202637,37.5669176],[126.9216428,37.5666350],[126.9219728,37.5665690],[126.9222721,37.5665281],[126.9228218,37.5664533],[126.9235741,37.5663993],[126.9237746,37.5663913],[126.9238369,37.5663889],[126.9243409,37.5663733],[126.9246603,37.5663658],[126.9249797,37.5663566],[126.9254010,37.5663397],[126.9255052,37.5663357],[126.9256298,37.5663300],[126.9257364,37.5663161],[126.9261591,37.5662623],[126.9268183,37.5660933],[126.9269408,37.5660642],[126.9270079,37.5660384],[126.9272577,37.5659359],[126.9278216,37.5656502],[126.9281739,37.5654744],[126.9285738,37.5651563],[126.9290185,37.5647511],[126.9298247,37.5640050],[126.9302615,37.5635997],[126.9305590,37.5633371],[126.9306229,37.5632770],[126.9306674,37.5632349],[126.9307962,37.5631156],[126.9308372,37.5630833],[126.9308954,37.5630322],[126.9311688,37.5628064],[126.9315052,37.5624926],[126.9316386,37.5623742],[126.9317298,37.5622927],[126.9317618,37.5622559],[126.9322534,37.5617796],[126.9327167,37.5613140],[126.9327486,37.5612853],[126.9329401,37.5611150],[126.9330267,37.5610379],[126.9330826,37.5609904],[126.9332489,37.5608497],[126.9333866,37.5607575],[126.9335668,37.5605871],[126.9337524,37.5604573],[126.9342623,37.5600992],[126.9345666,37.5599898],[126.9347494,37.5599249],[126.9350020,37.5599018],[126.9351934,37.5598991],[126.9355343,37.5598935],[126.9356690,37.5598923],[126.9361162,37.5599026],[126.9365825,37.5599210],[126.9366380,37.5599240],[126.9367353,37.5599281],[126.9368383,37.5599331],[126.9370908,37.5599361],[126.9372730,37.5599388],[126.9379511,37.5599537],[126.9388522,37.5599796],[126.9393197,37.5600017],[126.9399383,37.5600992],[126.9402160,37.5602051],[126.9402578,37.5602206],[126.9404112,37.5603016],[126.9405710,37.5604195],[126.9407591,37.5605547],[126.9408042,37.5605874],[126.9408728,37.5606409],[126.9409055,37.5606627],[126.9410244,37.5608156],[126.9412375,37.5610915],[126.9413500,37.5611821],[126.9413849,37.5612102],[126.9415481,37.5613417],[126.9416123,37.5613916],[126.9416731,37.5614378],[126.9419320,37.5616338],[126.9423316,37.5619475],[126.9423755,37.5619829],[126.9423969,37.5620001],[126.9424802,37.5620645],[126.9431026,37.5625749],[126.9433243,37.5627571],[126.9434312,37.5628396],[126.9436665,37.5630201],[126.9438691,37.5631833],[126.9440087,37.5632957],[126.9441809,37.5634344],[126.9442496,37.5634870],[126.9444849,37.5636666],[126.9448157,37.5639467],[126.9451720,37.5643026],[126.9460497,37.5653496],[126.9462368,37.5656245],[126.9465258,37.5660422],[126.9470210,37.5667575],[126.9474423,37.5673661],[126.9478871,37.5680081],[126.9479455,37.5680805],[126.9480487,37.5682054],[126.9481149,37.5682895],[126.9485282,37.5685961],[126.9487232,37.5687250],[126.9488055,37.5687759],[126.9493370,37.5690244],[126.9494747,37.5690827],[126.9513314,37.5697503],[126.9513890,37.5697713],[126.9515517,37.5698315],[126.9537053,37.5706302],[126.9538939,37.5706996],[126.9542440,37.5708292],[126.9547884,37.5710237],[126.9548889,37.5710593],[126.9551779,37.5711904],[126.9555049,37.5712181],[126.9562263,37.5712133],[126.9569024,37.5712065],[126.9575037,37.5712155],[126.9577912,37.5712286],[126.9578998,37.5712408],[126.9581058,37.5712634],[126.9585083,37.5713490],[126.9588923,37.5714797],[126.9591023,37.5715690],[126.9592445,37.5716372],[126.9595152,37.5717872],[126.9595986,37.5718417],[126.9602783,37.5722828],[126.9604678,37.5723819],[126.9606045,37.5724240],[126.9607617,37.5724644],[126.9609812,37.5724870],[126.9624117,37.5724575],[126.9630289,37.5724450],[126.9631093,37.5724463],[126.9632973,37.5724417],[126.9633109,37.5724418],[126.9635816,37.5724421],[126.9635940,37.5724422],[126.9637356,37.5724437],[126.9639426,37.5724753],[126.9640047,37.5724981],[126.9641075,37.5725346],[126.9642068,37.5725865],[126.9643070,37.5726599],[126.9644759,37.5727932],[126.9646255,37.5729354],[126.9647302,37.5730341],[126.9656356,37.5738972],[126.9657201,37.5739616],[126.9658318,37.5740143],[126.9660114,37.5740737],[126.9664478,37.5741866],[126.9665936,37.5742224],[126.9667530,37.5742682],[126.9669971,37.5743378],[126.9670580,37.5743615],[126.9671902,37.5744153],[126.9672985,37.5744680],[126.9674936,37.5745834],[126.9677740,37.5747992],[126.9678597,37.5748599],[126.9681459,37.5750604],[126.9682496,37.5751330],[126.9684930,37.5752954],[126.9686993,37.5754325],[126.9688007,37.5755132],[126.9688682,37.5755675],[126.9690630,37.5757225],[126.9692410,37.5758649],[126.9693606,37.5759240],[126.9694272,37.5759549],[126.9695729,37.5760124],[126.9697289,37.5760500],[126.9698749,37.5760642],[126.9701126,37.5760833],[126.9701443,37.5760825],[126.9702281,37.5760820],[126.9704094,37.5760702],[126.9707504,37.5760528],[126.9711878,37.5760160],[126.9717418,37.5759806],[126.9718120,37.5759746],[126.9721508,37.5759527],[126.9724953,37.5759227],[126.9726166,37.5759124],[126.9725156,37.5764230],[126.9725086,37.5764510],[126.9724874,37.5765581],[126.9724339,37.5767643],[126.9723954,37.5769237],[126.9723491,37.5770659],[126.9722695,37.5772674],[126.9722360,37.5773556],[126.9721541,37.5775679],[126.9721414,37.5776021],[126.9719453,37.5779519],[126.9718729,37.5781003],[126.9718557,37.5781363],[126.9718384,37.5781713],[126.9716621,37.5786077],[126.9715859,37.5788129],[126.9715201,37.5789910],[126.9714553,37.5791836],[126.9714131,37.5793790],[126.9713874,37.5794952],[126.9713651,37.5796015],[126.9713546,37.5796528],[126.9712733,37.5800995],[126.9712147,37.5803714],[126.9710743,37.5808413],[126.9709916,37.5811762],[126.9709334,37.5813959],[126.9709032,37.5815003],[126.9708777,37.5815876],[126.9708301,37.5817470],[126.9707408,37.5820458],[126.9707211,37.5821097],[126.9706330,37.5823851],[126.9705925,37.5825120],[126.9705373,37.5826344],[126.9704222,37.5828871],[126.9703829,37.5830005],[126.9703695,37.5831303],[126.9703662,37.5832853],[126.9703647,37.5833330],[126.9703683,37.5834701],[126.9703748,37.5836639],[126.9703759,37.5838342],[126.9703554,37.5840054],[126.9703400,37.5841054],[126.9703114,37.5842999],[126.9702782,37.5845089],[126.9702427,37.5847224],[126.9702155,37.5848908],[126.9702060,37.5849511],[126.9701871,37.5850664],[126.9701751,37.5851493],[126.9701680,37.5852033],[126.9701999,37.5853360],[126.9701831,37.5854603],[126.9700941,37.5858790],[126.9700429,37.5860672],[126.9700069,37.5861887],[126.9699767,37.5862940],[126.9697155,37.5870419],[126.9696496,37.5872308],[126.9695954,37.5873640],[126.9695135,37.5875673],[126.9694743,37.5876663],[126.9693432,37.5879424],[126.9692881,37.5880512],[126.9692136,37.5881663],[126.9690706,37.5883702],[126.9688960,37.5885578],[126.9686976,37.5887417],[126.9686611,37.5887713],[126.9684121,37.5889117],[126.9681040,37.5890680],[126.9670042,37.5895354],[126.9666530,37.5897050],[126.9664368,37.5898429],[126.9661250,37.5900560],[126.9660873,37.5900955],[126.9660097,37.5901798],[126.9659366,37.5902633],[126.9658943,37.5903136],[126.9658280,37.5903917],[126.9656930,37.5905840],[126.9654491,37.5909552],[126.9653117,37.5911555],[126.9652132,37.5913137],[126.9645776,37.5922789],[126.9644677,37.5924379],[126.9642880,37.5926994],[126.9641124,37.5930249],[126.9640058,37.5931939],[126.9638502,37.5934131],[126.9638314,37.5935085],[126.9637796,37.5937742],[126.9637109,37.5941948],[126.9636812,37.5943894],[126.9636278,37.5947334],[126.9636288,37.5948984],[126.9636414,37.5950427],[126.9636541,37.5951617],[126.9636836,37.5953178],[126.9637001,37.5953891],[126.9638418,37.5958413],[126.9638751,37.5959469],[126.9639374,37.5962554],[126.9639349,37.5962897],[126.9639263,37.5963807],[126.9638994,37.5965076],[126.9638244,37.5966993],[126.9636073,37.5969561],[126.9634498,37.5971158],[126.9633472,37.5972100],[126.9632240,37.5973248],[126.9629072,37.5975829],[126.9627101,37.5977443],[126.9626622,37.5977828],[126.9625177,37.5978822],[126.9625165,37.5978831],[126.9622798,37.5980388],[126.9621341,37.5981328],[126.9618575,37.5983091],[126.9616551,37.5984245],[126.9613810,37.5985737],[126.9612479,37.5986470],[126.9610819,37.5987292],[126.9608102,37.5988614],[126.9606386,37.5989426],[126.9604806,37.5990131],[126.9603511,37.5990702],[126.9603215,37.5990836],[126.9602954,37.5990934],[126.9602227,37.5991228],[126.9594015,37.5994210],[126.9593276,37.5994477],[126.9588598,37.5996078],[126.9587076,37.5996548],[126.9584993,37.5997999],[126.9583740,37.5998832],[126.9582838,37.5999846],[126.9582711,37.6000134],[126.9582749,37.6001161],[126.9582989,37.6002497],[126.9583996,37.6004160],[126.9585743,37.6005412],[126.9589197,37.6007176],[126.9591997,37.6008505],[126.9594424,37.6009670],[126.9595395,37.6010089],[126.9596356,37.6010363],[126.9597431,37.6010540],[126.9602616,37.6011005],[126.9604494,37.6011410],[126.9606865,37.6012494],[126.9607991,37.6013409],[126.9609375,37.6014831],[126.9610244,37.6016745],[126.9610489,37.6017413],[126.9610996,37.6019327],[126.9611486,37.6020573],[126.9611865,37.6021395],[126.9612444,37.6022821],[126.9613211,37.6024808],[126.9615622,37.6031327],[126.9616865,37.6033333],[126.9618249,37.6034746],[126.9620008,37.6035862],[126.9620752,37.6036370],[126.9621620,37.6036915],[126.9622365,37.6037324],[126.9624622,37.6038578],[126.9628472,37.6040462],[126.9629747,37.6041080],[126.9641991,37.6044741],[126.9645494,37.6045911],[126.9651991,37.6048410],[126.9652409,37.6048574],[126.9652860,37.6048775],[126.9653877,37.6049185],[126.9662868,37.6052993],[126.9663399,37.6053257],[126.9664776,37.6053957],[126.9666830,37.6054994],[126.9670431,37.6056804],[126.9671550,37.6057287],[126.9672295,37.6057605],[126.9672487,37.6057696],[126.9673741,37.6058243],[126.9676046,37.6059119],[126.9679867,37.6060244],[126.9682557,37.6061158],[126.9682738,37.6061213],[126.9684309,37.6061689],[126.9685428,37.6062027],[126.9687317,37.6062531],[126.9689046,37.6063134],[126.9692528,37.6064222],[126.9693262,37.6064451],[126.9694822,37.6064945],[126.9695241,37.6065082],[126.9701662,37.6066949],[126.9709497,37.6069319],[126.9709531,37.6069328],[126.9712165,37.6070142],[126.9712662,37.6070316],[126.9715838,37.6071366],[126.9718342,37.6072955],[126.9718748,37.6073245],[126.9719739,37.6074079],[126.9720561,37.6074813],[126.9721147,37.6075293],[126.9722519,37.6076723],[126.9722564,37.6076777],[126.9725181,37.6079989],[126.9727619,37.6082830],[126.9729686,37.6085336],[126.9731124,37.6087082],[126.9732371,37.6088575],[126.9733373,37.6089508],[126.9734467,37.6090216],[126.9736871,37.6091497],[126.9738984,37.6092381],[126.9739673,37.6092681],[126.9740723,37.6093155],[126.9746609,37.6095660],[126.9748619,37.6096498],[126.9750314,37.6097226],[126.9754617,37.6099075],[126.9758367,37.6100741],[126.9759418,37.6101197],[126.9759701,37.6101279],[126.9764830,37.6103348],[126.9767463,37.6104369],[126.9768920,37.6104943],[126.9774105,37.6107166],[126.9775619,37.6107830],[126.9777551,37.6108605],[126.9783911,37.6111292],[126.9785639,37.6112021],[126.9792124,37.6114745],[126.9798622,37.6115575],[126.9803118,37.6115830],[126.9808364,37.6115826],[126.9836373,37.6115660],[126.9855241,37.6115328],[126.9881481,37.6115343],[126.9883430,37.6115351],[126.9890897,37.6115357],[126.9892075,37.6115344],[126.9897808,37.6115359],[126.9905331,37.6115455],[126.9909908,37.6115421],[126.9912274,37.6115755],[126.9912636,37.6115802],[126.9915624,37.6116266],[126.9916100,37.6116250],[126.9919432,37.6116156],[126.9920305,37.6116132],[126.9923060,37.6115874],[126.9926271,37.6115194],[126.9928781,37.6114312],[126.9931383,37.6113242],[126.9932507,37.6112778],[126.9933598,37.6112350],[126.9935825,37.6111485],[126.9941097,37.6109227],[126.9941984,37.6108808],[126.9943745,37.6107995],[126.9945399,37.6109760],[126.9945905,37.6110303],[126.9947694,37.6112230],[126.9950461,37.6115225],[126.9952047,37.6116936],[126.9952497,37.6117424],[126.9954143,37.6116945],[126.9959282,37.6115885],[126.9960248,37.6115502],[126.9962296,37.6114302],[126.9964559,37.6112978],[126.9966015,37.6112119],[126.9970372,37.6109578],[126.9971089,37.6109157]],
	}

}