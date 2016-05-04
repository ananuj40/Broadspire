package com.example.anuj1.broadspire.Activity.activity.Activities.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.anuj1.broadspire.R;

/**
 * Created by Akhilesh on 4/27/2016.
 */

public class Agreement extends AppCompatActivity {
    public String textHtml = "<p>Broadspire My Claim Application Agreement (Individual Form)<br />\n" +
            "<br />\n" +
            "By signing onto this web site, you agree to be bound by the terms of this Broadspire My Claim Application Agreement (this &ldquo;Agreement&rdquo;). You represent and warrant that you are the employee who is the subject of the claim you will be viewing. You further represent and warrant that you have the right and authority to agree to the terms and conditions of this Agreement. In addition, by signing onto this web site, you are agreeing to comply with the terms and conditions set forth below. Throughout this Agreement, you will be referred to as &ldquo;You&rdquo; or &ldquo;Your.&rdquo;<br />\n" +
            "<br />\n" +
            "<span style=\"color:#ff8c00;\"><strong>1. License.</strong></span><br />\n" +
            "<br />\n" +
            "Broadspire Services, Inc. (&ldquo;BROADSPIRE&rdquo;) hereby grants You a nonexclusive, revocable, non-sublicensable, nontransferable license to access Broadspire&rsquo;s My Claim application (the &ldquo;Web Application&rdquo;) via the Internet, solely for Your personal use in connection with Your claim. BROADSPIRE hereby grants You the right to access the Web Application, subject to the terms and conditions of this Agreement.</p>\n" +
            "<p><span style=\"color:#ff8c00;\"><strong>2. Distribution Limitations.</strong></span><br />\n" +
            "<br />\n" +
            "Except as explicitly provided herein, You will not: A. Make access to all or any part of the Web Application available to any third party, directly or indirectly, by assignment, sublicense, or any other means; B. Copy, access in any fashion other than as permitted by this Agreement, reverse engineer, decompile, disassemble, make derivative works from, or modify in whole or in part the Web Application, or attempt or assist any third party in doing any of the activities in this subsection 2(B); C. Alter or remove any proprietary notices of BROADSPIRE or third parties found in or on the Web Application; D. Circumvent, disable, disclose, modify, or remove any software security protection methods (including license keycodes, serial numbers, or unlocking codes) that are used in the operation the Web Application; E. Use the Web Application to operate in a time sharing, outsourcing, or service bureau environment; or F. Use the Web Application except as permitted in this Agreement.<br />\n" +
            "<br />\n" +
            "<span style=\"color:#ff8c00;\"> <strong>3. Your Obligations</strong></span><br />\n" +
            "<br />\n" +
            "A. Access to the Web Application shall be through IDs, passwords, and other secure access devices, as issued or required by BROADSPIRE from time to time. You agree to adhere to and abide by all security and safety measures established by BROADSPIRE.</p>\n" +
            "<p>B. You will be responsible for the confidentiality and use of Your ID, passwords, and other security devices furnished to You in connection with BROADSPIRE providing access to the Web Application. You shall not share Your ID or passwords.<br />\n" +
            "<br />\n" +
            "<span style=\"color:#ff8c00;\"><strong>4. Confidential Information; Data Privacy.</strong></span><br />\n" +
            "<br />\n" +
            "A. &ldquo;Confidential Information&rdquo; means any proprietary or confidential information, trade secret, or know-how that belongs to BROADSPIRE or its affiliates or licensors and any personally-identifiable, health, or financial information of any individual (&ldquo;PII&rdquo;). Confidential Information includes:</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>(i). the Web Application, its documentation, and the terms and conditions of this Agreement;</p>\n" +
            "<p>(ii) information learned by You from viewing the Web Application screens; and</p>\n" +
            "<p>(iii) any non-public technical or business information of BROADSPIRE, including any information relating to a party&rsquo;s techniques, algorithms, current and future products and services, research, financial information, customer lists, business forecasts, and marketing plans and information.</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>B. You acknowledge the confidential and proprietary nature of the Confidential Information and agree</p>\n" +
            "<p>(1) to hold the Confidential Information in confidence,</p>\n" +
            "<p>(2) not to use the Confidential Information other than as permitted under this Agreement, and</p>\n" +
            "<p>(3) not to reveal or disclose any Confidential Information for any purpose to any third party. You will safeguard and protect the Confidential Information from theft, piracy, or unauthorized access.</p>\n" +
            "<p>&nbsp;C. Confidential Information will not include any information that:</p>\n" +
            "<p>(i) at the time disclosed to You, is in the public domain;</p>\n" +
            "<p>&nbsp;(ii) becomes part of the public domain through no breach of this Agreement by You; (iii) records demonstrate was developed independently by You without reference to the Confidential Information; or</p>\n" +
            "<p>(iv) is required to be disclosed by law; provided that You must give prior notice of the disclosure to BROADSPIRE sufficient to permit BROADSPIRE to seek a protective order, and, absent the entry of a protective order, You will only disclose Confidential Information to the minimum extent necessary to comply with a valid court or administrative order. D. You acknowledge and agree that, in the event of Your breach of this Section 4, BROADSPIRE will suffer irreparable injuries not compensable by money damages. Accordingly, BROADSPIRE will be entitled to a preliminary and final injunction without the necessity of posting any bond or proving actual damages. This remedy is separate and apart from, and in addition to, any other remedy BROADSPIRE may have. E. You agree to indemnify BROADSPIRE against any and all loss, cost, damage, and expense, including attorneys&rsquo; fees, arising from the misuse or disclosure of Confidential Information by You.<br />\n" +
            "<br />\n" +
            "<span style=\"color:#ff8c00;\"><strong>5. Disclaimer of Warranty.</strong></span><br />\n" +
            "<br />\n" +
            "THE WEB APPLICATION IS PROVIDED &ldquo;AS IS&rdquo; AND &ldquo;AS AVAILABLE,&rdquo; WITHOUT WARRANTY OF ANY KIND. BROADSPIRE MAKES NO REPRESENTATIONS OR WARRANTIES, WHETHER EXPRESS, IMPLIED, OR STATUTORY RELATING TO THE WEB APPLICATION, THE USE OR ANY INABILITY TO USE THE WEB APPLICATION, THE RESULTS OF THE USE OF THE WEB APPLICATION, OR THE ACCURACY OF THE WEB APPLICATION OR THE INFORMATION ACCESSIBLE THROUGH THE WEB APPLICATION. BROADSPIRE SPECIFICALLY DISCLAIMS ANY AND ALL IMPLIED WARRANTIES, INCLUDING THE WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ALL WARRANTIES OF TITLE AND NON-INFRINGEMENT. WITHOUT LIMITING THE FOREGOING, IN NO EVENT WILL BROADSPIRE BE RESPONSIBLE FOR ANY DEFECTS, ERRORS, OR NONCONFORMITIES ARISING FROM OR RELATED TO YOUR UNAUTHORIZED MODIFICATION OF THE WEB APPLICATION, COMBINATION OF THE WEB APPLICATION WITH EQUIPMENT, PRODUCTS, OR MATERIALS NOT FURNISHED BY BROADSPIRE, OR USE OF THE WEB APPLICATION IN ANY MANNER OTHER THAN AS INTENDED OR INSTRUCTED. YOU EXPRESSLY ACKNOWLEDGE AND AGREE THAT USE OF THE WEB APPLICATION IS AT YOUR SOLE RISK. YOU AGREE THAT YOU, NOT BROADSPIRE, IS RESPONSIBLE FOR EVALUATING THE RISKS ASSOCIATED WITH USE OF THE WEB APPLICATION.</p>\n" +
            "<p><span style=\"color:#ff8c00;\"><strong>6. Exclusion of Damages.</strong></span><br />\n" +
            "<br />\n" +
            "IN NO EVENT WILL BROADSPIRE BE LIABLE TO YOU, OR TO ANY THIRD PARTY, FOR ANY INDIRECT, INCIDENTAL, EXEMPLARY, PUNITIVE, SPECIAL, OR CONSEQUENTIAL DAMAGES OR LOSSES, INCLUDING LOSS OF USE, PROFITS, GOODWILL, OR SAVINGS, OR LOSS OF DATA, DATA FILES, OR PROGRAMS, ARISING OUT OF OR IN CONNECTION WITH THIS AGREEMENT OR THE USE OF THE WEB APPLICATION, WHETHER THE LIABILITY ARISES FROM ANY CLAIM BASED UPON CONTRACT, WARRANTY, TORT (INCLUDING NEGLIGENCE), OR OTHERWISE, EVEN IF BROADSPIRE IS ADVISED IN ADVANCE OF THE POSSIBILITY OF THE LIABILITY, LOSS, OR DAMAGE.<br />\n" +
            "<br />\n" +
            "<span style=\"color:#ff8c00;\"> <strong>7. Limitation of Liabilities.</strong></span><br />\n" +
            "<br />\n" +
            "YOU AGREE THAT THE TOTAL LIABILITY OF BROADSPIRE FOR ANY DAMAGES FOR ANY REASON UNDER OR IN CONNECTION WITH THIS AGREEMENT AND/OR THE USE OF THE WEB APPLICATION WILL BE LIMITED TO $1,000. THIS LIMITATION APPLIES TO ALL CAUSES OF ACTION IN THE AGGREGATE, INCLUDING BREACH OF CONTRACT, BREACH OF WARRANTY, INFRINGEMENT, NEGLIGENCE, STRICT LIABILITY, MISREPRESENTATIONS, AND ALL OTHER TORTS.<br />\n" +
            "<br />\n" +
            "<span style=\"color:#ff8c00;\"> <strong>8. Proprietary Rights.</strong></span><br />\n" +
            "<br />\n" +
            "You acknowledge that (a) the Web Application, and all intellectual property rights associated therewith, is the property of BROADSPIRE, and (b) other than the rights expressly granted in Section 1 of this Agreement, You acquire no right, title, or interest in or to the Web Application licensed to You under this Agreement. Broadspire collects cookies for the following purposes: 1) Form Authentication: This is an in-built cookie that .net creates automatically for Form Authentication. This encrypted cookie gets destroyed as soon as You logout from the Web Application, You close the browser, You browse to the login page or when Your session times out. 2) Remember Me functionality - Self Service application stores the User ID and Password in encrypted format in order to avoid additional login prompts once You have been authenticated. This cookie only stores Your user id and password.<br />\n" +
            "<br />\n" +
            "<span style=\"color:#ff8c00;\"><strong>9. Term and Termination.</strong></span><br />\n" +
            "<br />\n" +
            "A. This Agreement will commence upon the date You register to access this web site and will continue until terminated by You or BROADSPIRE following written notice; provided that BROADSPIRE may also terminate this Agreement by terminating Your access to the Web Application (such as by deactivating Your IDs or passwords). B. Upon the termination of this Agreement, You (1) will make no further use of the Web Application, (2) will either destroy or (if requested by BROADSPIRE) return to BROADSPIRE all copies of BROADSPIRE&rsquo;s Confidential Information, and (3) will certify in writing to BROADSPIRE that You have done so. C. Your rights and obligations with respect to Sections 2 and 4 through 14 of this Agreement will survive termination of this Agreement indefinitely.<br />\n" +
            "<br />\n" +
            "<span style=\"color:#ff8c00;\"><strong>10. Export Restrictions.</strong></span><br />\n" +
            "<br />\n" +
            "This Agreement is expressly made subject to any laws, regulations, orders, or other restrictions on the export from the United States of America of any content accessible through the Web Application or information about the Web Application which may be imposed from time to time by the government of the United States of America. You will not export any such content or information without the prior written consent of BROADSPIRE and in compliance with all applicable laws, regulations, orders, or other restrictions.<br />\n" +
            "<br />\n" +
            "<span style=\"color:#ff8c00;\"><strong>11. Indemnification.</strong></span><br />\n" +
            "<br />\n" +
            "You agree to indemnify, defend, and hold harmless BROADSPIRE and its employees, directors, officers, subcontractors, affiliates, successors, assigns, agents or, and other members of its workforce against any action, claim, dispute, liability, or loss (including attorneys&rsquo; fees and expenses) (collectively, &ldquo;Damages&rdquo;) suffered by BROADSPIRE and such persons and all Damages to third parties arising from or in connection with (a) any breach of the terms of this Agreement or (b) any negligence or wrongful acts or omissions, in either case, by You, including any such breach, act, or omission resulting in an unauthorized disclosure of Confidential Information or Your failure to perform Your obligations under this Agreement. Accordingly, on demand, You will reimburse BROADSPIRE for any and all such Damages.<br />\n" +
            "<br />\n" +
            "<span style=\"color:#ff8c00;\"><strong>12. Governing Law.</strong></span><br />\n" +
            "<br />\n" +
            "This Agreement is entered into in, and governed by the laws of, the State of Georgia, without regard to its conflict of laws principles that would result in the application of the laws of a jurisdiction other than the State of Georgia. Any action relating to this Agreement must be brought only in the federal or state courts located in Atlanta, Georgia, and You and BROADSPIRE consent to the exclusive venue and jurisdiction of those courts; provided that BROADSPIRE may seek injunctive or other equitable relief from any court of competent jurisdiction with respect to a breach or threatened breach of Section 2 or 4.<br />\n" +
            "<br />\n" +
            "<span style=\"color:#ff8c00;\"> <strong>13. Amendment; Waiver; No Third-Party Beneficiaries.</strong></span><br />\n" +
            "<br />\n" +
            "This Agreement may not be modified, nor will any provision of this Agreement be waived or amended, except in writing duly signed by You and BROADSPIRE. A waiver with respect to one event will not be construed as continuing, or as a bar to or waiver of any right or remedy to subsequent events. Nothing expressed or implied in this Agreement is intended to confer, nor will anything in this Agreement confer, upon any person other than the parties and the respective successors or assigns of the parties, any rights, remedies, obligations, or liabilities whatsoever.<br />\n" +
            "<br />\n" +
            "<span style=\"color:#ff8c00;\"> <strong>14. Miscellaneous.</strong></span><br />\n" +
            "<br />\n" +
            "A. This Agreement constitutes the entire, final, complete, and exclusive agreement between You and BROADSPIRE with respect to the subject matter of this Agreement. This Agreement supersedes all prior and contemporaneous agreements and representations, whether oral or written, regarding the subject matter of this Agreement. B. If any term of this Agreement is found to be invalid, illegal, or otherwise unenforceable, such finding shall not affect the other terms of this Agreement, or the whole of this Agreement, but such term shall be deemed modified to the extent necessary to render such term enforceable, and the rights and obligations of the parties shall be construed and enforced accordingly, preserving to the fullest permissible extent the intent and agreements of the parties as set forth in this Agreement. C. This Agreement shall be binding and inure to the benefit of the parties hereto and their respective permitted successors and assigns. You shall not assign any of Your rights or obligations under this Agreement without the prior written consent of BROADSPIRE. BROADSPIRE may freely assign its rights or obligations under this Agreement.<br />\n" +
            "&nbsp;&nbsp;&nbsp;</p>";
    MenuItem menuItem;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agreement);
        modifyActionBar();
        TextView textView = (TextView) findViewById(R.id.title2);
        // textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText(Html.fromHtml(textHtml));
        TextView rgister2 = (TextView) findViewById(R.id.allow);
        rgister2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Registration.class);
                startActivity(intent);
            }

        });

        //This is Register Button
        TextView rgister1 = (TextView) findViewById(R.id.deny);
        rgister1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }
        });


    }
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.action_menu, menu);
        menuItem = menu.findItem(R.id.back);
        return true;
    }
    public void modifyActionBar() {
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setLogo(R.drawable.broadspire_logo_white);
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setTitle(Html.fromHtml("<Small>Agreement</Small>"));
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.back);
    }
}
