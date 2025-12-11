# AWS Solutions Architect Portfolio Website

Professional portfolio website documenting the St Glendale College cloud migration project - a comprehensive AWS Solutions Architect journey from discovery to deployment.

## 🎯 Project Overview

This website documents a real-world AWS cloud migration project, showcasing:
- **8 Project Phases** following Solution Architecture Foundations methodology
- **92 Requirements** (40 Functional + 52 Non-Functional)
- **3 Migration Solution Options** (Rehost, Re-platform, Re-architect)
- **Infrastructure as Code** using Terraform and Ansible
- **AWS Well-Architected Framework** (CROPSS) integration

## 🚀 Quick Start

### Local Development

1. **Clone or download** this repository
2. **Open `index.html`** in your web browser
3. **No build process required** - it's a static site!

### Live Preview

Simply double-click `index.html` or use a local server:

```bash
# Python 3
python -m http.server 8000

# Python 2
python -m SimpleHTTPServer 8000

# Node.js (if you have npx)
npx http-server

# Then open: http://localhost:8000
```

## 📁 Project Structure

```
aws-portfolio-website/
├── index.html              # Homepage
├── phases.html            # Project phases overview (to be created)
├── blog.html              # Blog/updates section (to be created)
├── about.html             # About page (to be created)
├── css/
│   └── style.css          # Main stylesheet
├── js/
│   └── script.js          # Interactive features
├── phases/                # Individual phase pages (to be created)
│   ├── phase1.html
│   ├── phase2.html
│   └── phase3.html
├── deliverables/          # PDF downloads (to be added)
│   ├── discovery-summary.pdf
│   ├── requirements.pdf
│   └── risk-register.pdf
├── images/                # Images and diagrams (to be added)
│   ├── diagrams/
│   └── screenshots/
└── README.md              # This file
```

## 🌐 Deploy to GitHub Pages

### Option 1: GitHub Pages (Recommended - FREE)

1. **Create a GitHub repository**
   ```bash
   git init
   git add .
   git commit -m "Initial portfolio website"
   ```

2. **Push to GitHub**
   ```bash
   # Create repo on GitHub first, then:
   git remote add origin https://github.com/YOUR-USERNAME/aws-portfolio.git
   git branch -M main
   git push -u origin main
   ```

3. **Enable GitHub Pages**
   - Go to repository **Settings**
   - Navigate to **Pages** section
   - Source: Select **main** branch
   - Click **Save**
   - Your site will be live at: `https://YOUR-USERNAME.github.io/aws-portfolio/`

### Option 2: Netlify (Alternative - FREE)

1. **Drag and drop** your folder to [Netlify Drop](https://app.netlify.com/drop)
2. **Or connect** your GitHub repository for automatic deployments

### Option 3: Vercel (Alternative - FREE)

1. **Install** Vercel CLI: `npm i -g vercel`
2. **Deploy**: `vercel` in your project directory
3. Follow the prompts

## ✏️ Customization Guide

### Update Your Information

1. **Personal Details** (index.html, about.html):
   - Replace `yourusername` with your GitHub username
   - Update LinkedIn URL
   - Change email address

2. **GitHub Repository Links**:
   - Add links to your actual GitHub repos once created

3. **Profile Photo** (optional):
   - Add your photo to `images/` folder
   - Update reference in `about.html`

### Add New Content

1. **Blog Posts**:
   - Create new HTML files in root directory
   - Follow blog.html template
   - Add links to blog.html

2. **Project Phases**:
   - Create files in `phases/` directory
   - Follow phase1.html template
   - Include architecture diagrams

3. **Deliverables**:
   - Add PDF files to `deliverables/` folder
   - Update download links in phase pages

### Color Customization

Edit CSS variables in `css/style.css`:

```css
:root {
    --primary-color: #FF9900;    /* AWS Orange - change this */
    --secondary-color: #232F3E;  /* AWS Dark Blue */
    --accent-color: #146EB4;     /* AWS Light Blue */
}
```

## 📱 Features

- ✅ **Responsive Design** - Works on mobile, tablet, and desktop
- ✅ **Modern UI** - Clean, professional appearance
- ✅ **AWS Branding** - Official AWS colors and styling
- ✅ **Smooth Animations** - Fade-in effects and transitions
- ✅ **Interactive Timeline** - Visual project progression
- ✅ **Mobile Menu** - Hamburger menu for small screens
- ✅ **Fast Loading** - No dependencies, pure HTML/CSS/JS
- ✅ **SEO Friendly** - Semantic HTML and meta tags

## 🎨 Technologies Used

- **HTML5** - Semantic markup
- **CSS3** - Modern styling with CSS Grid and Flexbox
- **Vanilla JavaScript** - No frameworks needed
- **Google Fonts** - Inter font family

## 📝 Content TODO List

### Immediate (This Week):
- [ ] Create `phases.html` overview page
- [ ] Create `blog.html` with first post
- [ ] Create `about.html` with your background
- [ ] Create individual phase pages (phase1.html, phase2.html)

### Short-term (December):
- [ ] Add Discovery Phase PDF deliverables
- [ ] Upload architecture diagrams (once created in January)
- [ ] Write blog posts about Spring Boot development
- [ ] Add Terraform/Ansible code snippets

### Long-term (January+):
- [ ] Document Phase 3 (Solution Outline Definition)
- [ ] Add interactive architecture diagram viewer
- [ ] Create demo videos
- [ ] Add search functionality
- [ ] Implement dark mode toggle

## 🔄 Update Workflow

Weekly updates recommended:

1. **Document progress** in blog posts
2. **Add deliverables** as you complete them
3. **Update timeline** with current phase
4. **Upload diagrams** and screenshots
5. **Git commit and push** to auto-deploy

```bash
git add .
git commit -m "Week X update: [description]"
git push
```

## 📊 Next Steps

### Week 1 (Now):
1. ✅ Website structure created
2. ⏳ Create remaining pages (phases, blog, about)
3. ⏳ Add Discovery Phase content
4. ⏳ Deploy to GitHub Pages

### Week 2-3 (December):
5. ⏳ Weekly blog updates on Spring Boot development
6. ⏳ Add Terraform/Ansible learning notes
7. ⏳ Prepare Phase 3 page template

### Week 4+ (January):
8. ⏳ Document rehost migration
9. ⏳ Upload architecture diagrams
10. ⏳ Add code repositories
11. ⏳ Complete Phase 3 documentation

## 🤝 Contributing

This is a personal portfolio project, but feel free to:
- Fork for your own use
- Submit issues for bugs
- Suggest improvements

## 📄 License

This project is open source and available for personal and educational use.

## 📞 Contact

- **LinkedIn**: [Your Profile](https://linkedin.com/in/yourprofile)
- **GitHub**: [Your GitHub](https://github.com/yourusername)
- **Email**: your.email@example.com

---

**Built as part of AWS Solutions Architect certification journey** 🚀

Last Updated: November 2025