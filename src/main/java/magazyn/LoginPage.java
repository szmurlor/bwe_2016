package magazyn;

import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class LoginPage extends BasePage {
	private static final long serialVersionUID = 1L;

	protected String username;
	protected String password;

	public LoginPage(final PageParameters parameters) {
		super(parameters);

		add(new FeedbackPanel("feedback"));
		Form<Void> form;
		add( form = new Form<Void>("formLogin") {
			@Override
			protected void onSubmit() {
				System.out.println("Wprowadziłeś: " + LoginPage.this.username + " - " + LoginPage.this.password);
				setResponsePage(HomePage.class);
			}

			@Override
			protected void onError() {
			}
		});
		form.add( new TextField<String>("username", new PropertyModel<String>(this, "username") ));
		form.add( new PasswordTextField("password", new PropertyModel<String>(this, "password") ));
    }
}
