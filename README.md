<!DOCTYPE html>
<html>
<body>
    <h1>Dagger in Android Development - Step by Step Tutorials</h1>
    <p>This repository contains a series of tutorials on how to use Dagger in Android development. Each training lecture builds upon the previous one to gradually introduce Dagger concepts and best practices.</p>
    <h2>Training 1 - Manual Dependency Injection</h2>
    <ol>
        <li>Create <code>UserRepository</code> class.</li>
        <li>Create <code>EmailService</code> class.</li>
        <li>Create <code>UserRegistrationService</code> class.</li>
        <li>Add <code>registerUser</code> function in <code>UserRegistrationService</code> class.</li>
        <li>Use manual dependency injection by constructor injection.</li>
        <li>Run the app.</li>
    </ol>
    <h2>Training 2 - Introducing Dagger 2</h2>
    <ol>
        <li>Add Dagger 2 dependency to your project.</li>
        <li>Create a component interface for <code>UserRegistrationService</code>.</li>
        <li>Annotate the component interface with <code>@Component</code>.</li>
        <li>Add <code>@Inject</code> annotation to the constructor of <code>UserRegistrationService</code>, <code>UserRepository</code>, and <code>EmailService</code>.</li>
        <li><code>@Inject</code> tells Dagger 2 that the class can be injected.</li>
        <li>Get the instance of <code>UserRegistrationService</code> by calling <code>DaggerUserRegistrationServiceComponent.builder().build().getUserRegistrationService()</code>.</li>
        <li>Run the app.</li>
    </ol>
    <h2>Training 3 - Field Injection with Dagger</h2>
    <ol>
        <li>Address the inefficiency of creating too many objects in the component interface.</li>
        <li>Use <code>@Inject</code> annotation for field injection to solve this problem.</li>
        <li>Add <code>@Inject</code> annotation to the fields of <code>UserRegistrationService</code>, <code>UserRepository</code>, and <code>EmailService</code>.</li>
        <li>Pass the consumer class to the component interface.</li>
        <li>Get the instance of <code>UserRegistrationService</code> by calling <code>DaggerUserRegistrationServiceComponent.builder().build().inject(this)</code>.</li>
        <li>Run the app.</li>
    </ol>
    <h2>Training 4 - Using Interfaces with <code>@Provides</code> and <code>@Module</code></h2>
    <ol>
        <li>Introduce the need for more flexible and reusable code.</li>
        <li>Create <code>EmailServiceProvider</code> and <code>UserRepositoryProvider</code> interfaces.</li>
        <li>Use <code>@Module</code> and <code>@Provides</code> annotations to provide <code>EmailService</code> and <code>UserRepository</code> instances.</li>
    </ol>
    <h2>Training 5 - <code>@Binds</code> vs. <code>@Provides</code></h2>
    <ol>
        <li>Understand the difference between <code>@Binds</code> and <code>@Provides</code>.</li>
        <li><code>@Binds</code> is used for interfaces and abstract classes, while <code>@Provides</code> is used for concrete classes.</li>
        <li>Refactor the module to use <code>@Binds</code> instead of <code>@Provides</code>.</li>
    </ol>
    <h2>Training 6 - Custom Annotations and <code>@Qualifier</code></h2>
    <ol>
        <li>Handle scenarios where multiple services are needed, like sending SMS and sending Email.</li>
        <li>Use <code>@Named</code> annotation to differentiate between the two services.</li>
        <li>Create a custom annotation with <code>@Qualifier</code>, <code>@Documented</code>, and <code>@Retention</code> annotations to avoid typo errors.</li>
    </ol>
    <h2>Training 7 - Creating Objects at Runtime with <code>@Component.Factory</code></h2>
    <ol>
        <li>Deal with situations where objects need to be created at runtime, not compile time.</li>
        <li>Create a <code>Module</code> class for runtime object creation.</li>
        <li>Use <code>@Provides</code> annotation to tell Dagger to create objects at runtime.</li>
        <li>Implement the <code>@Component.Factory</code> interface in the component interface to pass dynamic values at runtime.</li>
    </ol>
    <h2>Training 8 - <code>@Singleton</code> Scope and Custom Scopes</h2>
    <ol>
        <li>Make objects singleton to save memory space.</li>
        <li>Use <code>@Singleton</code> annotation on the component, class, or method to make it singleton.</li>
        <li>Address the problem of component-level singletons by creating custom scopes with <code>@Scope</code> annotation.</li>
    </ol>
    <h2>Training 9 - Component Dependencies and Scopes</h2>
    <ol>
        <li>Use different services in specific activities or fragments, not in the entire application.</li>
        <li>Create an <code>AnalyticsService</code> with Application scope.</li>
        <li>Introduce a new <code>AppComponent</code> with <code>AnalyticsModule</code> for application-level services.</li>
        <li>Create a relationship between <code>AppComponent</code> and <code>ActivityComponent</code>.</li>
    </ol>
    <h2>Training 10 - Subcomponents in Dagger</h2>
    <ol>
        <li>Access all objects without defining them in the application-level component.</li>
        <li>Use subcomponents in Dagger to create dependent components.</li>
        <li>Replace <code>@Component</code> with <code>@Subcomponent</code> in the dependent component.</li>
        <li>Define the subcomponent relationship in the parent component.</li>
    </ol>
    <h2>Training 11 - Component Builders</h2>
    <ol>
        <li>Learn how to create a component using <code>@Component.Builder</code>.</li>
        <li>Understand the differences between <code>@Component.Factory</code> and <code>@Component.Builder</code>.</li>
        <li>Implement a component using <code>@Component.Builder</code> for projects requiring multiple parameters.</li>
    </ol>
    <h2>Usage</h2>
    <p>Please follow the tutorials in numerical order, starting with Training 1 and progressing to Training 11. The code for each training session is available in its respective directory.</p>
    <p>Feel free to explore the code and adapt it to your specific project needs. If you encounter any issues or have questions, don't hesitate to reach out.</p>
    <p>If you are looking for professional App development services or need a free consultation for your project, I invite you to visit my Fiverr profile. I offer high-quality and reliable services to help you bring your app ideas to life. Whether you need assistance with Android development, UI/UX design, or any other mobile app related task, I'm here to help. Let's collaborate and create something amazing together! Visit my Fiverr profile at <a href="https://www.fiverr.com/s/ZG6WR4">Hussain Sahir</a> to get started.</p>
    <p>Happy Daggering!</p>
</body>
</html>
